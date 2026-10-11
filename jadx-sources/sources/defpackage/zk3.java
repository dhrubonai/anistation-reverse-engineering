package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zk3 {
    public final String a;
    public final boolean b;
    public final String c;

    public zk3(String str, String str2) {
        boolean z;
        a34.v(str, "The log tag cannot be null or empty.");
        this.a = str;
        this.c = str2;
        if (str.length() <= 23) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
    }

    public final void a(Exception exc, String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.b) {
            String str2 = this.a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, c(str, objArr), exc);
            }
        }
    }

    public final void b(String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.b) {
            String str2 = this.a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, c(str, objArr));
            }
        }
    }

    public final String c(String str, Object... objArr) {
        String m;
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.c;
        if (TextUtils.isEmpty(str2)) {
            m = "";
        } else {
            m = qx1.m("[", str2, "] ");
        }
        if (!TextUtils.isEmpty(m)) {
            return m.concat(str);
        }
        return str;
    }
}
