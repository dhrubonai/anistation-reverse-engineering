package t7;

/* loaded from: classes.dex */
public final class h extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final transient z6.i f10060a;

    public h(z6.i iVar) {
        this.f10060a = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f10060a.toString();
    }
}
