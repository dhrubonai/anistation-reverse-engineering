package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import defpackage.a34;
import defpackage.b06;
import defpackage.fx0;
import defpackage.kl0;
import defpackage.os;
import defpackage.pn6;
import defpackage.w05;
import defpackage.wi5;
import defpackage.y45;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidUnityBootConfigDataSource implements UnityBootConfigDataSource {
    private final Context context;

    public AndroidUnityBootConfigDataSource(Context context) {
        context.getClass();
        this.context = context;
    }

    private static final pn6 getValue$lambda$2$lambda$1$lambda$0(String str, w05 w05Var, String str2) {
        str2.getClass();
        if (b06.I(str2, str, false)) {
            w05Var.x = str2.substring(str.length());
        }
        return pn6.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, w05] */
    @Override // com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource
    public String getValue(String str) {
        Object y45Var;
        String concat;
        ?? obj;
        InputStream open;
        str.getClass();
        try {
            concat = str.concat("=");
            obj = new Object();
            open = this.context.getAssets().open("bin/Data/boot.config");
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        try {
            open.getClass();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, kl0.a), 8192);
            try {
                Iterator it = ((fx0) wi5.p0(new os(bufferedReader, (byte) 2))).iterator();
                while (it.hasNext()) {
                    getValue$lambda$2$lambda$1$lambda$0(concat, obj, (String) it.next());
                }
                bufferedReader.close();
                open.close();
                y45Var = (String) obj.x;
                if (y45Var instanceof y45) {
                    y45Var = null;
                }
                return (String) y45Var;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    a34.C(bufferedReader, th2);
                    throw th3;
                }
            }
        } finally {
        }
    }
}
