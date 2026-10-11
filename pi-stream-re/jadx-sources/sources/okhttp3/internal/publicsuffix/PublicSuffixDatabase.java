package okhttp3.internal.publicsuffix;

import com.bumptech.glide.c;
import f9.x;
import java.io.InputStream;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import k9.d;
import k9.l;
import k9.n;
import k9.q;
import k9.y;
import o7.j;
import r6.h0;
import x6.m;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f8345e;

    /* renamed from: f, reason: collision with root package name */
    public static final List f8346f;

    /* renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f8347g;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f8348a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f8349b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f8350c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f8351d;

    static {
        new x(17, 0);
        f8345e = new byte[]{42};
        f8346f = c.L("*");
        f8347g = new PublicSuffixDatabase();
    }

    public static List c(String str) {
        int i10 = 0;
        List A1 = j.A1(str, new char[]{'.'});
        if (!A1.isEmpty()) {
            if (h0.g(A1.get(c.w(A1)), "")) {
                int size = A1.size() - 1;
                if (size >= 0) {
                    i10 = size;
                }
                return m.t0(A1, i10);
            }
            return A1;
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r1 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0038, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0036, code lost:
    
        if (r1 == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String");
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                Logger logger = n.f6536a;
                q qVar = new q(new l(new d(resourceAsStream, new y())));
                try {
                    long readInt = qVar.readInt();
                    qVar.A(readInt);
                    byte[] v9 = qVar.f6543b.v(readInt);
                    long readInt2 = qVar.readInt();
                    qVar.A(readInt2);
                    byte[] v10 = qVar.f6543b.v(readInt2);
                    h0.A(qVar, null);
                    synchronized (this) {
                        this.f8350c = v9;
                        this.f8351d = v10;
                    }
                } finally {
                }
            }
        } finally {
            this.f8349b.countDown();
        }
    }
}
