package com.vincent.videocompressor

data class VideoMetadata(var sourcePath: String,
                         var destinationPath: String) {
    var width: String = ""
    var height: String = ""
    var rotation: String = ""
    var duration: Long = 0
}