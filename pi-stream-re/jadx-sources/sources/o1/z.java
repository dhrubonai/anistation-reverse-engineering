package o1;

import java.util.UUID;

/* loaded from: classes.dex */
public final class z implements i1.b {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f8172d;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f8173a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8174b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8175c;

    static {
        boolean z9;
        if ("Amazon".equals(f1.b0.f3801c)) {
            String str = f1.b0.f3802d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z9 = true;
                f8172d = z9;
            }
        }
        z9 = false;
        f8172d = z9;
    }

    public z(UUID uuid, byte[] bArr, boolean z9) {
        this.f8173a = uuid;
        this.f8174b = bArr;
        this.f8175c = z9;
    }
}
