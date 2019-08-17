package com.mockito.mockitopractice;

public class RecordService {

    DatabaseDao databaseDao;
    NetworkDao networkDao;

    public Boolean save(String filename) {
        databaseDao.save(filename);
        System.out.println("saved data from main class");

        networkDao.save(filename);
        System.out.println("saved location from main class");

        return true;
    }

    public DatabaseDao getDatabaseDao() {
        return databaseDao;
    }

    public void setDatabaseDao(DatabaseDao databaseDao) {
        this.databaseDao = databaseDao;
    }

    public NetworkDao getNetworkDao() {
        return networkDao;
    }

    public void setNetworkDao(NetworkDao networkDao) {
        this.networkDao = networkDao;
    }
}