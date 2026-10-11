package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ks0 implements ow4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ks0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [g41, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kz] */
    @Override // defpackage.ow4
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ls0 ls0Var = (ls0) obj2;
                kr0 kr0Var = (kr0) obj;
                es0 es0Var = kr0Var.f;
                ?? obj3 = new Object();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<zd1> set = kr0Var.c;
                Set set2 = kr0Var.g;
                for (zd1 zd1Var : set) {
                    boolean z = zd1Var.c;
                    byte b2 = zd1Var.b;
                    px4 px4Var = zd1Var.a;
                    if (z == 0) {
                        if (b2 == 2) {
                            hashSet4.add(px4Var);
                        } else {
                            hashSet.add(px4Var);
                        }
                    } else if (z == 2) {
                        hashSet3.add(px4Var);
                    } else if (b2 == 2) {
                        hashSet5.add(px4Var);
                    } else {
                        hashSet2.add(px4Var);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(px4.a(vw4.class));
                }
                obj3.x = Collections.unmodifiableSet(hashSet);
                obj3.y = Collections.unmodifiableSet(hashSet2);
                Collections.unmodifiableSet(hashSet3);
                obj3.z = Collections.unmodifiableSet(hashSet4);
                obj3.A = Collections.unmodifiableSet(hashSet5);
                obj3.B = ls0Var;
                return es0Var.h(obj3);
            case 1:
                return new sk2((Context) obj2, (String) obj);
            default:
                n32 n32Var = (n32) obj2;
                String c = n32Var.c();
                ?? obj4 = new Object();
                Context createDeviceProtectedStorageContext = ((Context) obj).createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(c), 0);
                boolean z2 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z2 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = createDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(createDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z2 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                obj4.a = z2;
                return obj4;
        }
    }
}
