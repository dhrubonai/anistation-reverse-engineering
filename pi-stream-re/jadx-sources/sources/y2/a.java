package y2;

import java.util.List;
import r6.o0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f11540a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11541b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11542c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11543d;

    public a(List list, long j4, long j10) {
        this.f11540a = o0.j(list);
        this.f11541b = j4;
        this.f11542c = j10;
        long j11 = -9223372036854775807L;
        if (j4 != -9223372036854775807L && j10 != -9223372036854775807L) {
            j11 = j4 + j10;
        }
        this.f11543d = j11;
    }
}
