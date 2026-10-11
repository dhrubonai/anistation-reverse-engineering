package androidx.concurrent.futures;

/* loaded from: classes.dex */
public final class c extends Throwable {
    public c() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
