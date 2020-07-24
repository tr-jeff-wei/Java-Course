/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcs.us;

import java.util.List;

/**
 *
 * @author chuan
 */
public class AP2013_P1 {

}

class DownloadInfo {

      private String title;
      private int times;

      public DownloadInfo(String title) {
            this.title = title;
      }

      public String getTitle() {
            return title;
      }

      public void incrementTimesDownload() {
            times++;
      }

}

class MusicDownloads {

      private List<DownloadInfo> downloadList;

//      public DownloadInfo getDownloadInfo(String title) {
//            return null;
//      }
//
//      public void updateDownloads(List<String> titles) {
//
//      }

      public DownloadInfo getDownloadInfo(String title) {
            for (int i = 0; i < downloadList.size(); i++) {
                  if (downloadList.get(i).getTitle().equals(title)) {
                        return downloadList.get(i);
                  }
            }
            return null;
      }

      public void updateDownloads(List<String> titles) {
            for (int i = 0; i < titles.size(); i++) {
                  DownloadInfo info = getDownloadInfo(titles.get(i));
                  if (info != null) {
                        info.incrementTimesDownload();
                  } else {
                        info = new DownloadInfo(titles.get(i));
                        downloadList.add(info);
                  }
            }
      }
}
