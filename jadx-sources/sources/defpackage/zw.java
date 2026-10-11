package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zw {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final Long g;

    public zw(String str, String str2, String str3, String str4, Integer num, Integer num2, Long l, int i) {
        str4 = (i & 8) != 0 ? null : str4;
        num = (i & 16) != 0 ? null : num;
        num2 = (i & 32) != 0 ? null : num2;
        l = (i & 64) != 0 ? null : l;
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
        this.f = num2;
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zw) {
                zw zwVar = (zw) obj;
                if (!this.a.equals(zwVar.a) || !a34.i(this.b, zwVar.b) || !a34.i(this.c, zwVar.c) || !a34.i(this.d, zwVar.d) || !a34.i(this.e, zwVar.e) || !a34.i(this.f, zwVar.f) || !a34.i(this.g, zwVar.g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = zo5.i(this.b, this.a.hashCode() * 31, 31);
        int i2 = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        Integer num = this.e;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        Integer num2 = this.f;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i6 = (i5 + hashCode4) * 31;
        Long l = this.g;
        if (l != null) {
            i2 = l.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        StringBuilder o = h11.o("AudioTrackOption(id=", this.a, ", label=", this.b, ", language=");
        qx1.x(o, this.c, ", sourceType=", this.d, ", groupIndex=");
        o.append(this.e);
        o.append(", trackIndex=");
        o.append(this.f);
        o.append(", castTrackId=");
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
