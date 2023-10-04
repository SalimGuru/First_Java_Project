package com.java001;

public class FileDownloader extends Thread {
    private String fileName;

    public FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("Downloading " + fileName + " started...");
        try {
            Thread.sleep(5000); // Simulating file download delay (5 seconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Downloading " + fileName + " completed!");
    }

    public static void main(String[] args) {
        FileDownloader file1Downloader = new FileDownloader("file1.txt");
        FileDownloader file2Downloader = new FileDownloader("file2.txt");

        // Start both threads
        file1Downloader.start();
        file2Downloader.start();

        try {
            // Wait for both threads to finish
            file1Downloader.join();
            file2Downloader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All downloads completed!");
    }
}

