# LearnAndroid
LearnAndroid.

### MediaPlayerDemo

1. play and stop mp3

1. animation start and stop

### PlayGif

1. add `ndk.dir` to `local.properties`

        ndk.dir=/path/to/your/ndk/android-ndk-r10c

1. `v14/texture.xml` delte some lines of code

        line 3 xmlns:app="http://schemas.android.com/apk/res-auto"
        line 9 app:freezesAnimation="true"
        line 12 app:src="@drawable/anim_flag_iceland"
        line 19 android:src="@drawable/anim_flag_iceland"

1. android-gif-drawable's build.gradle

        change `apply from`
        apply from: 'https://raw.github.com/chrisbanes/gradle-mvn-push/master/gradle-mvn-push.gradle'
        to
        apply from: "$rootProject.projectDir/gradle/script/common.gradle"

1. and under project's gradle folder
    
    * create a new file `script/common.gradle`

    * and the file content is from [here](https://raw.github.com/chrisbanes/gradle-mvn-push/master/gradle-mvn-push.gradle)
