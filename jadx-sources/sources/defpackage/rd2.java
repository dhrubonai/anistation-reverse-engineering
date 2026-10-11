package defpackage;

import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rd2 implements zx3 {
    public static final rd2 b = new rd2(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ rd2(byte b2) {
        this.a = b2;
    }

    @Override // defpackage.zx3
    public final yx3 a(Class cls) {
        switch (this.a) {
            case 0:
                if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    try {
                        return (yx3) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
                    } catch (Exception e) {
                        ov3.k("Unable to get message info for ".concat(cls.getName()), e);
                        return null;
                    }
                }
                ze0.k("Unsupported message type: ".concat(cls.getName()));
                return null;
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.zx3
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return GeneratedMessageLite.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
