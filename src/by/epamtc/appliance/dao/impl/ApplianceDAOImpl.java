package by.epamtc.appliance.dao.impl;

import by.epamtc.appliance.dao.ApplianceFactory;
import by.epamtc.appliance.dao.inter.ApplianceFactoryDAO;
import by.epamtc.appliance.entity.Appliance;
import by.epamtc.appliance.dao.inter.ApplianceDAO;
import by.epamtc.appliance.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {
    @Override
    public List<Appliance> find(Criteria criteria) throws IOException {

        BufferedReader reader = Files.newBufferedReader(Paths.get("resources/appliances_db.txt"));

        List<Appliance> listOfObjectAppliances = new ArrayList<>();


        while (true) {

            String note;
            String noteApplianceName = null;

            note = reader.readLine();

            if (note == null) {
                break;
            } else if (note.equals("")) {
                continue;
            }

            noteApplianceName = note.split(":")[0].trim();//Oven из бд

            if (!criteria.getGroupSearchName().equals(noteApplianceName)) {
                continue;
            }

            ApplianceFactoryDAO applianceFactory = ApplianceFactory.createAppliance(noteApplianceName);//создаём конкрет класс

            List<String> listOfRequests = new ArrayList<>();

            List<String> listOfEnum = applianceFactory.createListFromEnum();

            boolean stringIsFind = false;



            for (int i = 0; i < listOfEnum.size(); i++) {//парсим мапу

                if (criteria.getValue(listOfEnum.get(i)) != null) {

                    listOfRequests.add(listOfEnum.get(i) + "=" + criteria.getValue(listOfEnum.get(i)));//получение запроса
                }
            }


            for (int i = 0; i < listOfRequests.size(); i++) {//проверка параметров

                if (note.contains(listOfRequests.get(i))) {

                    stringIsFind = true;
                } else {
                    stringIsFind = false;
                    continue;
                }

            }


            if (stringIsFind) {
                String[] arrayOfParams = parseParamFromNote(note);

                listOfObjectAppliances.add(applianceFactory.createObject(arrayOfParams));//добавление вновь созданного объекта
            }


        }

        return listOfObjectAppliances;
    }


    public static String[] parseParamFromNote(String note) {

        String[] arrayFromNote = note.split("\\=|\\,");
        String[] result = new String[arrayFromNote.length];

        for (int i = 0, k = 0; i < arrayFromNote.length; i++) {

            if (i % 2 == 1) {
                result[k] = arrayFromNote[i].trim();
                k++;
            }
        }


        return result;
    }

    // you may add your own code here
}


//you may add your own new classes