package e4;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class c0 implements v3.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3474a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f3475b;

    public c0(int i10) {
        this.f3474a = i10;
        if (i10 != 1) {
            this.f3475b = ByteBuffer.allocate(8);
        } else {
            this.f3475b = ByteBuffer.allocate(4);
        }
    }

    private void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num != null) {
            messageDigest.update(bArr);
            synchronized (this.f3475b) {
                this.f3475b.position(0);
                messageDigest.update(this.f3475b.putInt(num.intValue()).array());
            }
        }
    }

    @Override // v3.j
    public final void e(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f3474a) {
            case 0:
                Long l10 = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.f3475b) {
                    this.f3475b.position(0);
                    messageDigest.update(this.f3475b.putLong(l10.longValue()).array());
                }
                return;
            default:
                a(bArr, obj, messageDigest);
                return;
        }
    }
}
