package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class k1 extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f924b = new StringBuilder(128);

    /* renamed from: a, reason: collision with root package name */
    public final String f923a = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f924b;
        if (sb.length() > 0) {
            Log.d(this.f923a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c6 = cArr[i10 + i12];
            if (c6 == '\n') {
                a();
            } else {
                this.f924b.append(c6);
            }
        }
    }
}
