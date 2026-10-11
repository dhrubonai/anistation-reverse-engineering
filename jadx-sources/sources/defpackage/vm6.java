package defpackage;

import java.time.LocalDate;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vm6 {
    public final LocalDate a;
    public final long b;
    public final long c;
    public final String d;
    public final Map e;

    public vm6(LocalDate localDate, long j, long j2, String str, Map map) {
        localDate.getClass();
        map.getClass();
        this.a = localDate;
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = map;
    }

    public static vm6 a(vm6 vm6Var, LocalDate localDate, long j, long j2, String str, Map map, int i) {
        if ((i & 1) != 0) {
            localDate = vm6Var.a;
        }
        LocalDate localDate2 = localDate;
        if ((i & 2) != 0) {
            j = vm6Var.b;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = vm6Var.c;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            str = vm6Var.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            map = vm6Var.e;
        }
        Map map2 = map;
        vm6Var.getClass();
        localDate2.getClass();
        map2.getClass();
        return new vm6(localDate2, j3, j4, str2, map2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vm6) {
                vm6 vm6Var = (vm6) obj;
                if (!a34.i(this.a, vm6Var.a) || this.b != vm6Var.b || this.c != vm6Var.c || !this.d.equals(vm6Var.d) || !a34.i(this.e, vm6Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + zo5.i(this.d, qx1.d(qx1.d(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiState(selectedDate=");
        sb.append(this.a);
        sb.append(", dayStart=");
        sb.append(this.b);
        qx1.w(sb, ", dayEnd=", this.c, ", scheduleKey=");
        sb.append(this.d);
        sb.append(", scheduleData=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
