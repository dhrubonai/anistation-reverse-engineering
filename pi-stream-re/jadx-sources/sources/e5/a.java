package e5;

import android.util.Log;
import java.util.Locale;
import n1.u;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3538a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3539b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3540c;

    public a(String str, String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.f3539b = sb;
        this.f3538a = str;
        new u(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f3538a, i10)) {
            i10++;
        }
        this.f3540c = i10;
    }

    public final void a(String str, Object... objArr) {
        boolean z9;
        if (this.f3540c <= 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            Log.d(this.f3538a, d(str, objArr));
        }
    }

    public final void b(String str, Exception exc, Object... objArr) {
        Log.e(this.f3538a, d(str, objArr), exc);
    }

    public final void c(String str, Object... objArr) {
        Log.e(this.f3538a, d(str, objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f3539b.concat(str);
    }

    public final void e(String str, Object... objArr) {
        boolean z9;
        if (this.f3540c <= 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            Log.v(this.f3538a, d(str, objArr));
        }
    }

    public final void f(String str, Object... objArr) {
        Log.w(this.f3538a, d(str, objArr));
    }
}
