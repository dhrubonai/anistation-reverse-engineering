package p7;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class b1 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient a1 f8664a;

    public b1(String str, Throwable th, a1 a1Var) {
        super(str);
        this.f8664a = a1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b1) {
                b1 b1Var = (b1) obj;
                if (!r6.h0.g(b1Var.getMessage(), getMessage()) || !r6.h0.g(b1Var.f8664a, this.f8664a) || !r6.h0.g(b1Var.getCause(), getCause())) {
                }
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
        int i10;
        String message = getMessage();
        r6.h0.q(message);
        int hashCode = (this.f8664a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i10 = cause.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f8664a;
    }
}
