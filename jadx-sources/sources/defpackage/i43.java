package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class i43 extends CancellationException implements m01 {
    public final transient t43 x;

    public i43(String str, Throwable th, t43 t43Var) {
        super(str);
        this.x = t43Var;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.m01
    public final Throwable a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof i43) {
                i43 i43Var = (i43) obj;
                if (a34.i(i43Var.getMessage(), getMessage())) {
                    Object obj2 = i43Var.x;
                    if (obj2 == null) {
                        obj2 = la4.x;
                    }
                    Object obj3 = this.x;
                    if (obj3 == null) {
                        obj3 = la4.x;
                    }
                    if (!a34.i(obj2, obj3) || !a34.i(i43Var.getCause(), getCause())) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i;
        String message = getMessage();
        message.getClass();
        int hashCode = message.hashCode() * 31;
        Object obj = this.x;
        if (obj == null) {
            obj = la4.x;
        }
        int hashCode2 = (obj.hashCode() + hashCode) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i = cause.hashCode();
        } else {
            i = 0;
        }
        return hashCode2 + i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.x;
        if (obj == null) {
            obj = la4.x;
        }
        sb.append(obj);
        return sb.toString();
    }
}
