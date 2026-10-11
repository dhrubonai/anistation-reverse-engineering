package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xx {
    public final String a;
    public final Integer b;
    public final ut1 c;
    public final long d;
    public final long e;
    public final Map f;

    public xx(String str, Integer num, ut1 ut1Var, long j, long j2, HashMap hashMap) {
        this.a = str;
        this.b = num;
        this.c = ut1Var;
        this.d = j;
        this.e = j2;
        this.f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final tp c() {
        tp tpVar = new tp((byte) 1);
        String str = this.a;
        if (str != null) {
            tpVar.y = str;
            tpVar.z = this.b;
            ut1 ut1Var = this.c;
            if (ut1Var != null) {
                tpVar.A = ut1Var;
                tpVar.B = Long.valueOf(this.d);
                tpVar.C = Long.valueOf(this.e);
                tpVar.D = new HashMap(this.f);
                return tpVar;
            }
            qi2.m("Null encodedPayload");
            return null;
        }
        qi2.m("Null transportName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xx) {
            xx xxVar = (xx) obj;
            if (this.a.equals(xxVar.a)) {
                Integer num = xxVar.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c.equals(xxVar.c) && this.d == xxVar.d && this.e == xxVar.e && this.f.equals(xxVar.f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return this.f.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
