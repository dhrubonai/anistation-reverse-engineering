package z3;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class j implements q4.b {

    /* renamed from: a, reason: collision with root package name */
    public final MessageDigest f12053a;

    /* renamed from: b, reason: collision with root package name */
    public final q4.d f12054b = new q4.d();

    public j(MessageDigest messageDigest) {
        this.f12053a = messageDigest;
    }

    @Override // q4.b
    public final q4.d c() {
        return this.f12054b;
    }
}
