package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class tm4 extends CancellationException {
    public final /* synthetic */ byte x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tm4(String str, byte b) {
        super(str);
        this.x = b;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.x) {
            case 0:
                setStackTrace(jf7.B);
                return this;
            case 1:
                setStackTrace(nx7.C);
                return this;
            default:
                setStackTrace(tl7.h);
                return this;
        }
    }
}
