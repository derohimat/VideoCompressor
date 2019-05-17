package com.vincent.videocompressor;

import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.authoring.tracks.AACTrackImpl;

import java.io.IOException;

public class Mp4ParserProxy {

    public static void test(){
        try {
            AACTrackImpl aacTrackOriginal = new AACTrackImpl(new FileDataSourceImpl("audio.aac"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
