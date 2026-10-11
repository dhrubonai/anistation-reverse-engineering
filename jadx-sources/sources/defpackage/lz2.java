package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lz2 {
    public final /* synthetic */ byte a;
    public final yn2 b;
    public final yn2 c;
    public final yn2 d;
    public final yn2 e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public lz2(lz2[] lz2VarArr) {
        final byte b = 0;
        this.a = (byte) 0;
        this.f = lz2VarArr;
        int length = lz2VarArr.length;
        final yn2[] yn2VarArr = new yn2[length];
        for (int i = 0; i < length; i++) {
            yn2VarArr[i] = ((lz2[]) this.f)[i].b();
        }
        final byte b2 = 1;
        this.b = new yn2(new ic2() { // from class: fs6
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                float f0;
                byte b3 = b2;
                yn2[] yn2VarArr2 = yn2VarArr;
                dm4 dm4Var = (dm4) obj;
                float floatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        f0 = db.f0(dm4Var, false, yn2VarArr2, floatValue);
                        break;
                    default:
                        f0 = db.f0(dm4Var, true, yn2VarArr2, floatValue);
                        break;
                }
                return Float.valueOf(f0);
            }
        }, (byte) 1);
        int length2 = ((lz2[]) this.f).length;
        final yn2[] yn2VarArr2 = new yn2[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            yn2VarArr2[i2] = ((lz2[]) this.f)[i2].d();
        }
        this.c = new yn2(new ic2() { // from class: xn2
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                float f0;
                byte b3 = b2;
                yn2[] yn2VarArr3 = yn2VarArr2;
                dm4 dm4Var = (dm4) obj;
                float floatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        f0 = db.f0(dm4Var, false, yn2VarArr3, floatValue);
                        break;
                    default:
                        f0 = db.f0(dm4Var, true, yn2VarArr3, floatValue);
                        break;
                }
                return Float.valueOf(f0);
            }
        }, (byte) 0);
        int length3 = ((lz2[]) this.f).length;
        final yn2[] yn2VarArr3 = new yn2[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            yn2VarArr3[i3] = ((lz2[]) this.f)[i3].c();
        }
        this.d = new yn2(new ic2() { // from class: fs6
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                float f0;
                byte b3 = b;
                yn2[] yn2VarArr22 = yn2VarArr3;
                dm4 dm4Var = (dm4) obj;
                float floatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        f0 = db.f0(dm4Var, false, yn2VarArr22, floatValue);
                        break;
                    default:
                        f0 = db.f0(dm4Var, true, yn2VarArr22, floatValue);
                        break;
                }
                return Float.valueOf(f0);
            }
        }, (byte) 1);
        int length4 = ((lz2[]) this.f).length;
        final yn2[] yn2VarArr4 = new yn2[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            yn2VarArr4[i4] = ((lz2[]) this.f)[i4].a();
        }
        this.e = new yn2(new ic2() { // from class: xn2
            @Override // defpackage.ic2
            public final Object invoke(Object obj, Object obj2) {
                float f0;
                byte b3 = b;
                yn2[] yn2VarArr32 = yn2VarArr4;
                dm4 dm4Var = (dm4) obj;
                float floatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        f0 = db.f0(dm4Var, false, yn2VarArr32, floatValue);
                        break;
                    default:
                        f0 = db.f0(dm4Var, true, yn2VarArr32, floatValue);
                        break;
                }
                return Float.valueOf(f0);
            }
        }, (byte) 0);
    }

    public final yn2 a() {
        byte b = this.a;
        return this.e;
    }

    public final yn2 b() {
        byte b = this.a;
        return this.b;
    }

    public final yn2 c() {
        byte b = this.a;
        return this.d;
    }

    public final yn2 d() {
        byte b = this.a;
        return this.c;
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "innermostOf(");
                int i = 0;
                for (lz2 lz2Var : (lz2[]) obj) {
                    i++;
                    if (i > 1) {
                        sb.append((CharSequence) ", ");
                    }
                    ct5.e(sb, lz2Var, null);
                }
                sb.append((CharSequence) ")");
                return sb.toString();
            default:
                return qx1.m("RectRulers(", (String) obj, ")");
        }
    }

    public lz2(String str) {
        this.a = (byte) 1;
        this.f = str;
        this.b = new yn2(null, (byte) 1);
        this.c = new yn2(null, (byte) 0);
        this.d = new yn2(null, (byte) 1);
        this.e = new yn2(null, (byte) 0);
    }
}
