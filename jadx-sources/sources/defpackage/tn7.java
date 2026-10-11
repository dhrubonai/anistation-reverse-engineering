package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tn7 extends sa7 implements wn7 {
    @Override // defpackage.wn7
    public final void beginAdUnitExposure(String str, long j) {
        Parcel K = K();
        K.writeString(str);
        K.writeLong(j);
        M(K, 23);
    }

    @Override // defpackage.wn7
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel K = K();
        K.writeString(str);
        K.writeString(str2);
        tm7.b(K, bundle);
        M(K, 9);
    }

    @Override // defpackage.wn7
    public final void endAdUnitExposure(String str, long j) {
        Parcel K = K();
        K.writeString(str);
        K.writeLong(j);
        M(K, 24);
    }

    @Override // defpackage.wn7
    public final void generateEventId(bo7 bo7Var) {
        Parcel K = K();
        tm7.c(K, bo7Var);
        M(K, 22);
    }

    @Override // defpackage.wn7
    public final void getCachedAppInstanceId(bo7 bo7Var) {
        Parcel K = K();
        tm7.c(K, bo7Var);
        M(K, 19);
    }

    @Override // defpackage.wn7
    public final void getConditionalUserProperties(String str, String str2, bo7 bo7Var) {
        Parcel K = K();
        K.writeString(str);
        K.writeString(str2);
        tm7.c(K, bo7Var);
        M(K, 10);
    }

    @Override // defpackage.wn7
    public final void getCurrentScreenClass(bo7 bo7Var) {
        Parcel K = K();
        tm7.c(K, bo7Var);
        M(K, 17);
    }

    @Override // defpackage.wn7
    public final void getCurrentScreenName(bo7 bo7Var) {
        Parcel K = K();
        tm7.c(K, bo7Var);
        M(K, 16);
    }

    @Override // defpackage.wn7
    public final void getGmpAppId(bo7 bo7Var) {
        Parcel K = K();
        tm7.c(K, bo7Var);
        M(K, 21);
    }

    @Override // defpackage.wn7
    public final void getMaxUserProperties(String str, bo7 bo7Var) {
        Parcel K = K();
        K.writeString(str);
        tm7.c(K, bo7Var);
        M(K, 6);
    }

    @Override // defpackage.wn7
    public final void getUserProperties(String str, String str2, boolean z, bo7 bo7Var) {
        Parcel K = K();
        K.writeString(str);
        K.writeString(str2);
        ClassLoader classLoader = tm7.a;
        K.writeInt(z ? 1 : 0);
        tm7.c(K, bo7Var);
        M(K, 5);
    }

    @Override // defpackage.wn7
    public final void initialize(tt2 tt2Var, so7 so7Var, long j) {
        Parcel K = K();
        tm7.c(K, tt2Var);
        tm7.b(K, so7Var);
        K.writeLong(j);
        M(K, 1);
    }

    @Override // defpackage.wn7
    public final void initializeWithElapsedTime(tt2 tt2Var, so7 so7Var, long j, long j2) {
        Parcel K = K();
        tm7.c(K, tt2Var);
        tm7.b(K, so7Var);
        K.writeLong(j);
        K.writeLong(j2);
        M(K, 60);
    }

    @Override // defpackage.wn7
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Parcel K = K();
        K.writeString(str);
        K.writeString(str2);
        tm7.b(K, bundle);
        K.writeInt(1);
        K.writeInt(1);
        K.writeLong(j);
        K.writeLong(j2);
        M(K, 59);
    }

    @Override // defpackage.wn7
    public final void logHealthData(int i, String str, tt2 tt2Var, tt2 tt2Var2, tt2 tt2Var3) {
        Parcel K = K();
        K.writeInt(5);
        K.writeString("Error with data collection. Data lost.");
        tm7.c(K, tt2Var);
        tm7.c(K, tt2Var2);
        tm7.c(K, tt2Var3);
        M(K, 33);
    }

    @Override // defpackage.wn7
    public final void onActivityCreatedByScionActivityInfo(to7 to7Var, Bundle bundle, long j) {
        Parcel K = K();
        tm7.b(K, to7Var);
        tm7.b(K, bundle);
        K.writeLong(j);
        M(K, 53);
    }

    @Override // defpackage.wn7
    public final void onActivityDestroyedByScionActivityInfo(to7 to7Var, long j) {
        Parcel K = K();
        tm7.b(K, to7Var);
        K.writeLong(j);
        M(K, 54);
    }

    @Override // defpackage.wn7
    public final void onActivityPausedByScionActivityInfo(to7 to7Var, long j) {
        Parcel K = K();
        tm7.b(K, to7Var);
        K.writeLong(j);
        M(K, 55);
    }

    @Override // defpackage.wn7
    public final void onActivityResumedByScionActivityInfo(to7 to7Var, long j) {
        Parcel K = K();
        tm7.b(K, to7Var);
        K.writeLong(j);
        M(K, 56);
    }

    @Override // defpackage.wn7
    public final void onActivitySaveInstanceStateByScionActivityInfo(to7 to7Var, bo7 bo7Var, long j) {
        Parcel K = K();
        tm7.b(K, to7Var);
        tm7.c(K, bo7Var);
        K.writeLong(j);
        M(K, 57);
    }

    @Override // defpackage.wn7
    public final void onActivityStartedByScionActivityInfo(to7 to7Var, long j) {
        Parcel K = K();
        tm7.b(K, to7Var);
        K.writeLong(j);
        M(K, 51);
    }

    @Override // defpackage.wn7
    public final void onActivityStoppedByScionActivityInfo(to7 to7Var, long j) {
        Parcel K = K();
        tm7.b(K, to7Var);
        K.writeLong(j);
        M(K, 52);
    }

    @Override // defpackage.wn7
    public final void retrieveAndUploadBatches(eo7 eo7Var) {
        Parcel K = K();
        tm7.c(K, eo7Var);
        M(K, 58);
    }

    @Override // defpackage.wn7
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel K = K();
        tm7.b(K, bundle);
        K.writeLong(j);
        M(K, 8);
    }

    @Override // defpackage.wn7
    public final void setCurrentScreenByScionActivityInfo(to7 to7Var, String str, String str2, long j) {
        Parcel K = K();
        tm7.b(K, to7Var);
        K.writeString(str);
        K.writeString(str2);
        K.writeLong(j);
        M(K, 50);
    }

    @Override // defpackage.wn7
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }
}
