package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fr0 implements b23, ws6, p60, fu5 {
    public final /* synthetic */ byte x;
    public int y;
    public Object z;

    public fr0(byte b) {
        this.x = b;
        switch (b) {
            case 13:
                this.z = new zi4(8);
                return;
            default:
                this.z = new LinkedHashMap();
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01df, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.fr0 g(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr0.g(android.content.res.Resources, int, android.content.res.Resources$Theme):fr0");
    }

    public static void j(String str) {
        int i;
        boolean z;
        if (!str.equalsIgnoreCase(":memory:")) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (a34.D(str.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i2++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i2, length + 1).toString().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e) {
                    Log.w("SupportSQLite", "delete failed: ", e);
                }
            }
        }
    }

    @Override // defpackage.p60
    public ii3 A(jr3 jr3Var) {
        ii3 A = ((p60) this.z).A(jr3Var);
        if (A == null) {
            return null;
        }
        return h3.q(A, new ua2(this, (byte) 3), qg1.x);
    }

    @Override // defpackage.p60
    public ii3 F(byte[] bArr) {
        return h3.q(((p60) this.z).F(bArr), new ua2(this, (byte) 3), qg1.x);
    }

    @Override // defpackage.ws6
    public void a(ns6 ns6Var) {
        l34 l34Var = (l34) this.z;
        l34Var.e.execute(new f32((Object) l34Var, (Object) ns6Var, (byte) 17));
    }

    public void b() {
        mu2 mu2Var;
        int i = this.y;
        this.y = i + 1;
        if (i >= 10) {
            this.y = 0;
            Iterator it = ((LinkedHashMap) this.z).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    tz4 tz4Var = (tz4) yo0.m0(arrayList);
                    if (tz4Var != null) {
                        mu2Var = (mu2) tz4Var.a.get();
                    } else {
                        mu2Var = null;
                    }
                    if (mu2Var == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((tz4) arrayList.get(i4)).a.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    @Override // defpackage.b23
    public void e(char c) {
        k(this.y, 1);
        char[] cArr = (char[]) this.z;
        int i = this.y;
        this.y = i + 1;
        cArr[i] = c;
    }

    @Override // defpackage.b23
    public void h(String str) {
        int i;
        str.getClass();
        k(this.y, str.length() + 2);
        char[] cArr = (char[]) this.z;
        int i2 = this.y;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c = cArr[i5];
            byte[] bArr = jz5.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i6 = i5 - i3; i6 < length2; i6++) {
                    k(i5, 2);
                    char charAt = str.charAt(i6);
                    byte[] bArr2 = jz5.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i5 + 1;
                            ((char[]) this.z)[i5] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = jz5.a[charAt];
                                str2.getClass();
                                k(i5, str2.length());
                                str2.getChars(0, str2.length(), (char[]) this.z, i5);
                                int length3 = str2.length() + i5;
                                this.y = length3;
                                i5 = length3;
                            } else {
                                char[] cArr2 = (char[]) this.z;
                                cArr2[i5] = '\\';
                                cArr2[i5 + 1] = (char) b;
                                i5 += 2;
                                this.y = i5;
                            }
                        }
                    } else {
                        i = i5 + 1;
                        ((char[]) this.z)[i5] = charAt;
                    }
                    i5 = i;
                }
                k(i5, 1);
                ((char[]) this.z)[i5] = '\"';
                this.y = i5 + 1;
                return;
            }
            i5++;
        }
        cArr[i4] = '\"';
        this.y = i4 + 1;
    }

    @Override // defpackage.b23
    public void i(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        k(this.y, length);
        str.getChars(0, str.length(), (char[]) this.z, this.y);
        this.y += length;
    }

    public void k(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.z;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.z = Arrays.copyOf(cArr, i3);
        }
    }

    public boolean l() {
        if (this.y < ((ArrayList) this.z).size()) {
            return true;
        }
        return false;
    }

    public void m(int i, yt ytVar) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            yt ytVar2 = ((yt[]) this.z)[i2];
            ytVar2.getClass();
            if (a34.E(0L, ytVar.g - ytVar2.g) <= 0) {
                break;
            }
            ytVar2.f = i;
            ((yt[]) this.z)[i] = ytVar2;
            i = i2;
        }
        ((yt[]) this.z)[i] = ytVar;
        ytVar.f = i;
    }

    public void n(hb2 hb2Var, int i, int i2) {
        ((o65) this.z).d(new w26(hb2Var), i, i2);
    }

    public long o(p81 p81Var) {
        zi4 zi4Var = (zi4) this.z;
        int i = 0;
        p81Var.j(zi4Var.a, 0, 1, false);
        int i2 = zi4Var.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        p81Var.j(zi4Var.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (zi4Var.a[i] & 255) + (i5 << 8);
        }
        this.y = i4 + 1 + this.y;
        return i5;
    }

    public void p(yt ytVar) {
        yt ytVar2;
        int i = ytVar.f;
        if (i != -1) {
            int i2 = this.y;
            yt ytVar3 = ((yt[]) this.z)[i2];
            ytVar3.getClass();
            ytVar.f = -1;
            ((yt[]) this.z)[i2] = null;
            this.y = i2 - 1;
            if (ytVar == ytVar3) {
                return;
            }
            int E = a34.E(0L, ytVar3.g - ytVar.g);
            if (E == 0) {
                ((yt[]) this.z)[i] = ytVar3;
                ytVar3.f = i;
                return;
            }
            if (E < 0) {
                while (true) {
                    int i3 = i << 1;
                    int i4 = i3 + 1;
                    int i5 = this.y;
                    if (i4 <= i5) {
                        ytVar2 = ((yt[]) this.z)[i3];
                        ytVar2.getClass();
                        yt ytVar4 = ((yt[]) this.z)[i4];
                        ytVar4.getClass();
                        if (a34.E(0L, ytVar4.g - ytVar2.g) >= 0) {
                            ytVar2 = ytVar4;
                        }
                    } else {
                        if (i3 > i5) {
                            break;
                        }
                        ytVar2 = ((yt[]) this.z)[i3];
                        ytVar2.getClass();
                    }
                    if (a34.E(0L, ytVar2.g - ytVar3.g) <= 0) {
                        break;
                    }
                    int i6 = ytVar2.f;
                    ytVar2.f = i;
                    ((yt[]) this.z)[i] = ytVar2;
                    i = i6;
                }
                ((yt[]) this.z)[i] = ytVar3;
                ytVar3.f = i;
                return;
            }
            m(i, ytVar3);
            return;
        }
        ze0.k("Failed requirement.");
    }

    public void r(gx3 gx3Var, mu2 mu2Var, Map map, long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.z;
        Object obj = linkedHashMap.get(gx3Var);
        if (obj == null) {
            obj = new ArrayList();
            linkedHashMap.put(gx3Var, obj);
        }
        ArrayList arrayList = (ArrayList) obj;
        tz4 tz4Var = new tz4(new WeakReference(mu2Var), map, j);
        if (arrayList.isEmpty()) {
            arrayList.add(tz4Var);
        } else {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                tz4 tz4Var2 = (tz4) arrayList.get(i);
                if (j >= tz4Var2.c) {
                    if (tz4Var2.a.get() == mu2Var) {
                        arrayList.set(i, tz4Var);
                    } else {
                        arrayList.add(i, tz4Var);
                    }
                } else {
                    i++;
                }
            }
        }
        b();
    }

    @Override // defpackage.p60
    public ii3 s(Uri uri) {
        return h3.q(((p60) this.z).s(uri), new ua2(this, (byte) 3), qg1.x);
    }

    public String toString() {
        switch (this.x) {
            case 3:
                return new String((char[]) this.z, 0, this.y);
            case 14:
                iw2 iw2Var = (iw2) this.z;
                int i = iw2Var.y;
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    int b = iw2Var.b(i2);
                    String str = eq6.a;
                    arrayList.add(new String(new byte[]{(byte) (b >> 24), (byte) (b >> 16), (byte) (b >> 8), (byte) b}, StandardCharsets.US_ASCII));
                }
                StringBuilder sb = new StringBuilder("UnsupportedBrands{major=");
                int i3 = this.y;
                String str2 = eq6.a;
                sb.append(new String(new byte[]{(byte) (i3 >> 24), (byte) (i3 >> 16), (byte) (i3 >> 8), (byte) i3}, StandardCharsets.US_ASCII));
                sb.append(", compatible=");
                sb.append(arrayList);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ws6
    public void w() {
        boolean z;
        boolean z2;
        l34 l34Var = (l34) this.z;
        int i = this.y;
        yb1 yb1Var = l34Var.o;
        yb1Var.getClass();
        synchronized (yb1Var) {
            try {
                io3.B(eq6.l(yb1Var.f, i));
                byte b = 0;
                if (yb1Var.o != -1) {
                    z = true;
                } else {
                    z = false;
                }
                io3.B(z);
                ((xb1) yb1Var.f.get(i)).b = true;
                int i2 = 0;
                while (true) {
                    if (i2 < yb1Var.f.size()) {
                        if (!((xb1) yb1Var.f.valueAt(i2)).b) {
                            z2 = false;
                            break;
                        }
                        i2++;
                    } else {
                        z2 = true;
                        break;
                    }
                }
                yb1Var.g = z2;
                if (((xb1) yb1Var.f.get(yb1Var.o)).a.isEmpty()) {
                    if (i == yb1Var.o) {
                        yb1Var.d();
                    }
                    if (z2) {
                        yb1Var.a.k();
                        return;
                    }
                }
                if (i != yb1Var.o && ((xb1) yb1Var.f.get(i)).a.size() == 1) {
                    yb1Var.e.f(new ub1(yb1Var, b), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.b23
    public void writeLong(long j) {
        i(String.valueOf(j));
    }

    public /* synthetic */ fr0(Object obj, int i, byte b) {
        this.x = b;
        this.z = obj;
        this.y = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fr0(String str, int i, int i2) {
        this(str, (i2 & 2) != 0 ? 0 : i, false);
        this.x = (byte) 1;
    }

    public fr0(String str, int i, boolean z) {
        this.x = (byte) 1;
        this.z = z ? qx1.g(')', "(", str) : str;
        this.y = z ? i + 1 : i;
    }

    public fr0(int[] iArr, int i) {
        this.x = (byte) 14;
        this.y = i;
        iw2 iw2Var = iw2.z;
        if (iArr != null && iArr.length != 0) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            iw2Var = new iw2(copyOf, copyOf.length);
        }
        this.z = iw2Var;
    }

    public /* synthetic */ fr0(byte b, boolean z) {
        this.x = b;
    }

    public fr0(o65 o65Var, int i) {
        this.x = (byte) 10;
        this.z = o65Var;
        this.x = (byte) 10;
        this.y = i;
    }

    public fr0(ArrayList arrayList) {
        this.x = (byte) 11;
        this.z = arrayList;
    }

    public fr0(boolean z, boolean z2, boolean z3) {
        this.x = (byte) 5;
        this.y = (z || z2 || z3) ? 1 : 0;
    }
}
