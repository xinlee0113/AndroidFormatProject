# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

-keep class * extends android.app.Activity
-keep class * extends android.app.Application
-keep class * extends android.app.Service
-keep class * extends android.content.BroadcastReceiver
-keep class * extends android.content.ContentProvider
-keep class * extends android.app.backup.BackupAgentHelper
-keep class * extends android.preference.Preference
-keep class * extends android.os.Bundle
-keep class * extends android.app.Fragment

-keep class android.support.**{*;}

-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

-keep class * implements android.os.Parcelable {*;}

-keepattributes Exceptions,InnerClasses,Signature,Deprecated,SourceFile,LineNumberTable,*Annotation*,Synthetic,EnclosingMethod

#INoProguard接口的子接口、实现类都不能混淆
-keep interface com.tencent.wecarnavi.business.service.core.INoProguard{*;}
-keep interface * extends com.tencent.wecarnavi.business.service.core.INoProguard{*;}
-keep class * implements com.tencent.wecarnavi.business.service.core.INoProguard{public protected *;}

#gson库不能混淆
-keep class com.google.gson.**{*;}