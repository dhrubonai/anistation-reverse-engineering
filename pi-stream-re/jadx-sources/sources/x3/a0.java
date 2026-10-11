package x3;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a0 extends Exception {

    /* renamed from: f, reason: collision with root package name */
    public static final StackTraceElement[] f11140f = new StackTraceElement[0];

    /* renamed from: a, reason: collision with root package name */
    public final List f11141a;

    /* renamed from: b, reason: collision with root package name */
    public v3.i f11142b;

    /* renamed from: c, reason: collision with root package name */
    public v3.a f11143c;

    /* renamed from: d, reason: collision with root package name */
    public Class f11144d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11145e;

    public a0(String str) {
        this(str, Collections.emptyList());
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (th instanceof a0) {
            Iterator it = ((a0) th).f11141a.iterator();
            while (it.hasNext()) {
                a((Throwable) it.next(), arrayList);
            }
            return;
        }
        arrayList.add(th);
    }

    public static void b(List list, z zVar) {
        try {
            c(list, zVar);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void c(List list, z zVar) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            zVar.append("Cause (");
            int i11 = i10 + 1;
            zVar.append(String.valueOf(i11));
            zVar.append(" of ");
            zVar.append(String.valueOf(size));
            zVar.append("): ");
            Throwable th = (Throwable) list.get(i10);
            if (th instanceof a0) {
                ((a0) th).f(zVar);
            } else {
                d(th, zVar);
            }
            i10 = i11;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i11 = i10 + 1;
            sb.append(i11);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i10));
            i10 = i11;
        }
    }

    public final void f(Appendable appendable) {
        d(this, appendable);
        b(this.f11141a, new z(appendable));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f11145e);
        String str3 = "";
        if (this.f11144d == null) {
            str = "";
        } else {
            str = ", " + this.f11144d;
        }
        sb.append(str);
        if (this.f11143c == null) {
            str2 = "";
        } else {
            str2 = ", " + this.f11143c;
        }
        sb.append(str2);
        if (this.f11142b != null) {
            str3 = ", " + this.f11142b;
        }
        sb.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        f(System.err);
    }

    public a0(String str, List list) {
        this.f11145e = str;
        setStackTrace(f11140f);
        this.f11141a = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }
}
