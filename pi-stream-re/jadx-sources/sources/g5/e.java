package g5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import androidx.fragment.app.w;
import com.google.android.gms.common.api.y;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p7.a0;

/* loaded from: classes.dex */
public final class e extends d {
    public static final Parcelable.Creator<e> CREATOR = new y(16);

    /* renamed from: a, reason: collision with root package name */
    public final int f4445a;

    /* renamed from: b, reason: collision with root package name */
    public final Parcel f4446b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4447c;

    /* renamed from: d, reason: collision with root package name */
    public final i f4448d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4449e;

    /* renamed from: f, reason: collision with root package name */
    public int f4450f;

    /* renamed from: x, reason: collision with root package name */
    public int f4451x;

    public e(int i10, Parcel parcel, i iVar) {
        String str;
        this.f4445a = i10;
        w7.b.s(parcel);
        this.f4446b = parcel;
        this.f4447c = 2;
        this.f4448d = iVar;
        if (iVar == null) {
            str = null;
        } else {
            str = iVar.f4460c;
        }
        this.f4449e = str;
        this.f4450f = 2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:172:0x033d. Please report as an issue. */
    public static void h(StringBuilder sb, Map map, Parcel parcel) {
        boolean z9;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((a) entry.getValue()).f4442x, entry);
        }
        sb.append('{');
        int q02 = q6.g.q0(parcel);
        boolean z10 = false;
        while (parcel.dataPosition() < q02) {
            int readInt = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) readInt);
            if (entry2 != null) {
                if (z10) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                a aVar = (a) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (aVar.B != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                BigInteger bigInteger = null;
                BigInteger bigInteger2 = null;
                Parcel[] parcelArr = null;
                boolean[] zArr = null;
                BigDecimal[] bigDecimalArr = null;
                double[] dArr = null;
                float[] fArr = null;
                long[] jArr = null;
                BigInteger[] bigIntegerArr = null;
                Parcel parcel2 = null;
                String str2 = null;
                String encodeToString = null;
                int i10 = aVar.f4439d;
                if (z9) {
                    switch (i10) {
                        case 0:
                            j(sb, aVar, c.zaD(aVar, Integer.valueOf(q6.g.Q(readInt, parcel))));
                            break;
                        case 1:
                            int U = q6.g.U(readInt, parcel);
                            int dataPosition = parcel.dataPosition();
                            if (U != 0) {
                                byte[] createByteArray = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition + U);
                                bigInteger2 = new BigInteger(createByteArray);
                            }
                            j(sb, aVar, c.zaD(aVar, bigInteger2));
                            break;
                        case 2:
                            j(sb, aVar, c.zaD(aVar, Long.valueOf(q6.g.S(readInt, parcel))));
                            break;
                        case 3:
                            q6.g.w0(parcel, readInt, 4);
                            j(sb, aVar, c.zaD(aVar, Float.valueOf(parcel.readFloat())));
                            break;
                        case 4:
                            q6.g.w0(parcel, readInt, 8);
                            j(sb, aVar, c.zaD(aVar, Double.valueOf(parcel.readDouble())));
                            break;
                        case 5:
                            j(sb, aVar, c.zaD(aVar, q6.g.k(readInt, parcel)));
                            break;
                        case 6:
                            j(sb, aVar, c.zaD(aVar, Boolean.valueOf(q6.g.N(readInt, parcel))));
                            break;
                        case zzaja.zze.zzg /* 7 */:
                            j(sb, aVar, c.zaD(aVar, q6.g.p(readInt, parcel)));
                            break;
                        case 8:
                        case 9:
                            j(sb, aVar, c.zaD(aVar, q6.g.m(readInt, parcel)));
                            break;
                        case 10:
                            Bundle l10 = q6.g.l(readInt, parcel);
                            HashMap hashMap = new HashMap();
                            for (String str3 : l10.keySet()) {
                                String string = l10.getString(str3);
                                w7.b.s(string);
                                hashMap.put(str3, string);
                            }
                            j(sb, aVar, c.zaD(aVar, hashMap));
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i10);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else {
                    boolean z11 = aVar.f4440e;
                    String str4 = aVar.f4444z;
                    if (z11) {
                        sb.append("[");
                        switch (i10) {
                            case 0:
                                int[] n9 = q6.g.n(readInt, parcel);
                                int length = n9.length;
                                for (int i11 = 0; i11 < length; i11++) {
                                    if (i11 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(Integer.toString(n9[i11]));
                                }
                                break;
                            case 1:
                                int U2 = q6.g.U(readInt, parcel);
                                int dataPosition2 = parcel.dataPosition();
                                if (U2 != 0) {
                                    int readInt2 = parcel.readInt();
                                    bigIntegerArr = new BigInteger[readInt2];
                                    for (int i12 = 0; i12 < readInt2; i12++) {
                                        bigIntegerArr[i12] = new BigInteger(parcel.createByteArray());
                                    }
                                    parcel.setDataPosition(dataPosition2 + U2);
                                }
                                int length2 = bigIntegerArr.length;
                                for (int i13 = 0; i13 < length2; i13++) {
                                    if (i13 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(bigIntegerArr[i13]);
                                }
                                break;
                            case 2:
                                int U3 = q6.g.U(readInt, parcel);
                                int dataPosition3 = parcel.dataPosition();
                                if (U3 != 0) {
                                    jArr = parcel.createLongArray();
                                    parcel.setDataPosition(dataPosition3 + U3);
                                }
                                int length3 = jArr.length;
                                for (int i14 = 0; i14 < length3; i14++) {
                                    if (i14 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(Long.toString(jArr[i14]));
                                }
                                break;
                            case 3:
                                int U4 = q6.g.U(readInt, parcel);
                                int dataPosition4 = parcel.dataPosition();
                                if (U4 != 0) {
                                    fArr = parcel.createFloatArray();
                                    parcel.setDataPosition(dataPosition4 + U4);
                                }
                                int length4 = fArr.length;
                                for (int i15 = 0; i15 < length4; i15++) {
                                    if (i15 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(Float.toString(fArr[i15]));
                                }
                                break;
                            case 4:
                                int U5 = q6.g.U(readInt, parcel);
                                int dataPosition5 = parcel.dataPosition();
                                if (U5 != 0) {
                                    dArr = parcel.createDoubleArray();
                                    parcel.setDataPosition(dataPosition5 + U5);
                                }
                                int length5 = dArr.length;
                                for (int i16 = 0; i16 < length5; i16++) {
                                    if (i16 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(Double.toString(dArr[i16]));
                                }
                                break;
                            case 5:
                                int U6 = q6.g.U(readInt, parcel);
                                int dataPosition6 = parcel.dataPosition();
                                if (U6 != 0) {
                                    int readInt3 = parcel.readInt();
                                    bigDecimalArr = new BigDecimal[readInt3];
                                    for (int i17 = 0; i17 < readInt3; i17++) {
                                        byte[] createByteArray2 = parcel.createByteArray();
                                        bigDecimalArr[i17] = new BigDecimal(new BigInteger(createByteArray2), parcel.readInt());
                                    }
                                    parcel.setDataPosition(dataPosition6 + U6);
                                }
                                int length6 = bigDecimalArr.length;
                                for (int i18 = 0; i18 < length6; i18++) {
                                    if (i18 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(bigDecimalArr[i18]);
                                }
                                break;
                            case 6:
                                int U7 = q6.g.U(readInt, parcel);
                                int dataPosition7 = parcel.dataPosition();
                                if (U7 != 0) {
                                    zArr = parcel.createBooleanArray();
                                    parcel.setDataPosition(dataPosition7 + U7);
                                }
                                int length7 = zArr.length;
                                for (int i19 = 0; i19 < length7; i19++) {
                                    if (i19 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(Boolean.toString(zArr[i19]));
                                }
                                break;
                            case zzaja.zze.zzg /* 7 */:
                                String[] q9 = q6.g.q(readInt, parcel);
                                int length8 = q9.length;
                                for (int i20 = 0; i20 < length8; i20++) {
                                    if (i20 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append("\"");
                                    sb.append(q9[i20]);
                                    sb.append("\"");
                                }
                                break;
                            case 8:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                int U8 = q6.g.U(readInt, parcel);
                                int dataPosition8 = parcel.dataPosition();
                                if (U8 != 0) {
                                    int readInt4 = parcel.readInt();
                                    Parcel[] parcelArr2 = new Parcel[readInt4];
                                    for (int i21 = 0; i21 < readInt4; i21++) {
                                        int readInt5 = parcel.readInt();
                                        if (readInt5 != 0) {
                                            int dataPosition9 = parcel.dataPosition();
                                            Parcel obtain = Parcel.obtain();
                                            obtain.appendFrom(parcel, dataPosition9, readInt5);
                                            parcelArr2[i21] = obtain;
                                            parcel.setDataPosition(dataPosition9 + readInt5);
                                        } else {
                                            parcelArr2[i21] = null;
                                        }
                                    }
                                    parcel.setDataPosition(dataPosition8 + U8);
                                    parcelArr = parcelArr2;
                                }
                                int length9 = parcelArr.length;
                                for (int i22 = 0; i22 < length9; i22++) {
                                    if (i22 > 0) {
                                        sb.append(",");
                                    }
                                    parcelArr[i22].setDataPosition(0);
                                    w7.b.s(str4);
                                    w7.b.s(aVar.A);
                                    Map map2 = (Map) aVar.A.f4459b.get(str4);
                                    w7.b.s(map2);
                                    h(sb, map2, parcelArr[i22]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        sb.append("]");
                    } else {
                        switch (i10) {
                            case 0:
                                sb.append(q6.g.Q(readInt, parcel));
                                z10 = true;
                                break;
                            case 1:
                                int U9 = q6.g.U(readInt, parcel);
                                int dataPosition10 = parcel.dataPosition();
                                if (U9 != 0) {
                                    byte[] createByteArray3 = parcel.createByteArray();
                                    parcel.setDataPosition(dataPosition10 + U9);
                                    bigInteger = new BigInteger(createByteArray3);
                                }
                                sb.append(bigInteger);
                                z10 = true;
                                break;
                            case 2:
                                sb.append(q6.g.S(readInt, parcel));
                                z10 = true;
                                break;
                            case 3:
                                q6.g.w0(parcel, readInt, 4);
                                sb.append(parcel.readFloat());
                                z10 = true;
                                break;
                            case 4:
                                q6.g.w0(parcel, readInt, 8);
                                sb.append(parcel.readDouble());
                                z10 = true;
                                break;
                            case 5:
                                sb.append(q6.g.k(readInt, parcel));
                                z10 = true;
                                break;
                            case 6:
                                sb.append(q6.g.N(readInt, parcel));
                                z10 = true;
                                break;
                            case zzaja.zze.zzg /* 7 */:
                                String p3 = q6.g.p(readInt, parcel);
                                sb.append("\"");
                                sb.append(i5.a.a(p3));
                                sb.append("\"");
                                z10 = true;
                                break;
                            case 8:
                                byte[] m5 = q6.g.m(readInt, parcel);
                                sb.append("\"");
                                if (m5 != null) {
                                    encodeToString = Base64.encodeToString(m5, 0);
                                }
                                sb.append(encodeToString);
                                sb.append("\"");
                                z10 = true;
                                break;
                            case 9:
                                byte[] m9 = q6.g.m(readInt, parcel);
                                sb.append("\"");
                                if (m9 != null) {
                                    str2 = Base64.encodeToString(m9, 10);
                                }
                                sb.append(str2);
                                sb.append("\"");
                                break;
                            case 10:
                                Bundle l11 = q6.g.l(readInt, parcel);
                                Set<String> keySet = l11.keySet();
                                sb.append("{");
                                boolean z12 = true;
                                for (String str5 : keySet) {
                                    if (!z12) {
                                        sb.append(",");
                                    }
                                    sb.append("\"");
                                    sb.append(str5);
                                    sb.append("\":\"");
                                    sb.append(i5.a.a(l11.getString(str5)));
                                    sb.append("\"");
                                    z12 = false;
                                }
                                sb.append("}");
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                int U10 = q6.g.U(readInt, parcel);
                                int dataPosition11 = parcel.dataPosition();
                                if (U10 != 0) {
                                    parcel2 = Parcel.obtain();
                                    parcel2.appendFrom(parcel, dataPosition11, U10);
                                    parcel.setDataPosition(dataPosition11 + U10);
                                }
                                parcel2.setDataPosition(0);
                                w7.b.s(str4);
                                w7.b.s(aVar.A);
                                Map map3 = (Map) aVar.A.f4459b.get(str4);
                                w7.b.s(map3);
                                h(sb, map3, parcel2);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                }
                z10 = true;
            }
        }
        if (parcel.dataPosition() == q02) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(q02);
        throw new w(sb3.toString(), parcel);
    }

    public static final void i(StringBuilder sb, int i10, Object obj) {
        String str = null;
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case zzaja.zze.zzg /* 7 */:
                sb.append("\"");
                w7.b.s(obj);
                sb.append(i5.a.a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                byte[] bArr = (byte[]) obj;
                if (bArr != null) {
                    str = Base64.encodeToString(bArr, 0);
                }
                sb.append(str);
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                byte[] bArr2 = (byte[]) obj;
                if (bArr2 != null) {
                    str = Base64.encodeToString(bArr2, 10);
                }
                sb.append(str);
                sb.append("\"");
                return;
            case 10:
                w7.b.s(obj);
                a0.q0(sb, (HashMap) obj);
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i10);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static final void j(StringBuilder sb, a aVar, Object obj) {
        boolean z9 = aVar.f4438c;
        int i10 = aVar.f4437b;
        if (z9) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (i11 != 0) {
                    sb.append(",");
                }
                i(sb, i10, arrayList.get(i11));
            }
            sb.append("]");
            return;
        }
        i(sb, i10, obj);
    }

    @Override // g5.c
    public final void addConcreteTypeArrayInternal(a aVar, String str, ArrayList arrayList) {
        g(aVar);
        ArrayList arrayList2 = new ArrayList();
        w7.b.s(arrayList);
        arrayList.size();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((e) ((c) arrayList.get(i10))).f());
        }
        int i11 = aVar.f4442x;
        Parcel parcel = this.f4446b;
        int t02 = a0.t0(i11, parcel);
        int size2 = arrayList2.size();
        parcel.writeInt(size2);
        for (int i12 = 0; i12 < size2; i12++) {
            Parcel parcel2 = (Parcel) arrayList2.get(i12);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        a0.u0(t02, parcel);
    }

    @Override // g5.c
    public final void addConcreteTypeInternal(a aVar, String str, c cVar) {
        g(aVar);
        Parcel f10 = ((e) cVar).f();
        Parcel parcel = this.f4446b;
        int i10 = aVar.f4442x;
        if (f10 == null) {
            parcel.writeInt(i10 | 0);
            return;
        }
        int t02 = a0.t0(i10, parcel);
        parcel.appendFrom(f10, 0, f10.dataSize());
        a0.u0(t02, parcel);
    }

    public final Parcel f() {
        int i10 = this.f4450f;
        Parcel parcel = this.f4446b;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.u0(this.f4451x, parcel);
                this.f4450f = 2;
            }
        } else {
            int t02 = a0.t0(20293, parcel);
            this.f4451x = t02;
            a0.u0(t02, parcel);
            this.f4450f = 2;
        }
        return parcel;
    }

    public final void g(a aVar) {
        if (aVar.f4442x != -1) {
            Parcel parcel = this.f4446b;
            if (parcel != null) {
                int i10 = this.f4450f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        return;
                    } else {
                        throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
                    }
                } else {
                    this.f4451x = a0.t0(20293, parcel);
                    this.f4450f = 1;
                    return;
                }
            }
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
    }

    @Override // g5.c
    public final Map getFieldMappings() {
        i iVar = this.f4448d;
        if (iVar == null) {
            return null;
        }
        String str = this.f4449e;
        w7.b.s(str);
        return (Map) iVar.f4459b.get(str);
    }

    @Override // g5.d, g5.c
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // g5.d, g5.c
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // g5.c
    public final void setBooleanInternal(a aVar, String str, boolean z9) {
        g(aVar);
        a0.d0(this.f4446b, aVar.f4442x, z9);
    }

    @Override // g5.c
    public final void setDecodedBytesInternal(a aVar, String str, byte[] bArr) {
        g(aVar);
        a0.f0(this.f4446b, aVar.f4442x, bArr, true);
    }

    @Override // g5.c
    public final void setIntegerInternal(a aVar, String str, int i10) {
        g(aVar);
        a0.h0(this.f4446b, aVar.f4442x, i10);
    }

    @Override // g5.c
    public final void setLongInternal(a aVar, String str, long j4) {
        g(aVar);
        a0.k0(this.f4446b, aVar.f4442x, j4);
    }

    @Override // g5.c
    public final void setStringInternal(a aVar, String str, String str2) {
        g(aVar);
        a0.n0(this.f4446b, aVar.f4442x, str2, true);
    }

    @Override // g5.c
    public final void setStringMapInternal(a aVar, String str, Map map) {
        g(aVar);
        Bundle bundle = new Bundle();
        w7.b.s(map);
        for (String str2 : map.keySet()) {
            bundle.putString(str2, (String) map.get(str2));
        }
        a0.e0(this.f4446b, aVar.f4442x, bundle, true);
    }

    @Override // g5.c
    public final void setStringsInternal(a aVar, String str, ArrayList arrayList) {
        g(aVar);
        w7.b.s(arrayList);
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = (String) arrayList.get(i10);
        }
        a0.o0(this.f4446b, aVar.f4442x, strArr, true);
    }

    @Override // g5.c
    public final String toString() {
        i iVar = this.f4448d;
        w7.b.r(iVar, "Cannot convert to JSON on client side.");
        Parcel f10 = f();
        f10.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        String str = this.f4449e;
        w7.b.s(str);
        Map map = (Map) iVar.f4459b.get(str);
        w7.b.s(map);
        h(sb, map, f10);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        i iVar;
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f4445a);
        Parcel f10 = f();
        if (f10 != null) {
            int t03 = a0.t0(2, parcel);
            parcel.appendFrom(f10, 0, f10.dataSize());
            a0.u0(t03, parcel);
        }
        if (this.f4447c != 0) {
            iVar = this.f4448d;
        } else {
            iVar = null;
        }
        a0.m0(parcel, 3, iVar, i10, false);
        a0.u0(t02, parcel);
    }

    @Override // g5.c
    public final void zab(a aVar, String str, BigDecimal bigDecimal) {
        g(aVar);
        Parcel parcel = this.f4446b;
        int i10 = aVar.f4442x;
        if (bigDecimal == null) {
            parcel.writeInt(i10 | 0);
            return;
        }
        int t02 = a0.t0(i10, parcel);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        a0.u0(t02, parcel);
    }

    @Override // g5.c
    public final void zad(a aVar, String str, ArrayList arrayList) {
        g(aVar);
        w7.b.s(arrayList);
        int size = arrayList.size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigDecimalArr[i10] = (BigDecimal) arrayList.get(i10);
        }
        int i11 = aVar.f4442x;
        Parcel parcel = this.f4446b;
        int t02 = a0.t0(i11, parcel);
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeByteArray(bigDecimalArr[i12].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i12].scale());
        }
        a0.u0(t02, parcel);
    }

    @Override // g5.c
    public final void zaf(a aVar, String str, BigInteger bigInteger) {
        g(aVar);
        Parcel parcel = this.f4446b;
        int i10 = aVar.f4442x;
        if (bigInteger == null) {
            parcel.writeInt(i10 | 0);
            return;
        }
        int t02 = a0.t0(i10, parcel);
        parcel.writeByteArray(bigInteger.toByteArray());
        a0.u0(t02, parcel);
    }

    @Override // g5.c
    public final void zah(a aVar, String str, ArrayList arrayList) {
        g(aVar);
        w7.b.s(arrayList);
        int size = arrayList.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigIntegerArr[i10] = (BigInteger) arrayList.get(i10);
        }
        int i11 = aVar.f4442x;
        Parcel parcel = this.f4446b;
        int t02 = a0.t0(i11, parcel);
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeByteArray(bigIntegerArr[i12].toByteArray());
        }
        a0.u0(t02, parcel);
    }

    @Override // g5.c
    public final void zak(a aVar, String str, ArrayList arrayList) {
        g(aVar);
        w7.b.s(arrayList);
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i10 = 0; i10 < size; i10++) {
            zArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue();
        }
        int i11 = aVar.f4442x;
        Parcel parcel = this.f4446b;
        int t02 = a0.t0(i11, parcel);
        parcel.writeBooleanArray(zArr);
        a0.u0(t02, parcel);
    }

    @Override // g5.c
    public final void zan(a aVar, String str, double d10) {
        g(aVar);
        int i10 = aVar.f4442x | 524288;
        Parcel parcel = this.f4446b;
        parcel.writeInt(i10);
        parcel.writeDouble(d10);
    }

    @Override // g5.c
    public final void zap(a aVar, String str, ArrayList arrayList) {
        g(aVar);
        w7.b.s(arrayList);
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) arrayList.get(i10)).doubleValue();
        }
        int i11 = aVar.f4442x;
        Parcel parcel = this.f4446b;
        int t02 = a0.t0(i11, parcel);
        parcel.writeDoubleArray(dArr);
        a0.u0(t02, parcel);
    }

    @Override // g5.c
    public final void zar(a aVar, String str, float f10) {
        g(aVar);
        int i10 = aVar.f4442x | 262144;
        Parcel parcel = this.f4446b;
        parcel.writeInt(i10);
        parcel.writeFloat(f10);
    }

    @Override // g5.c
    public final void zat(a aVar, String str, ArrayList arrayList) {
        g(aVar);
        w7.b.s(arrayList);
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = ((Float) arrayList.get(i10)).floatValue();
        }
        int i11 = aVar.f4442x;
        Parcel parcel = this.f4446b;
        int t02 = a0.t0(i11, parcel);
        parcel.writeFloatArray(fArr);
        a0.u0(t02, parcel);
    }

    @Override // g5.c
    public final void zaw(a aVar, String str, ArrayList arrayList) {
        g(aVar);
        w7.b.s(arrayList);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        a0.i0(this.f4446b, aVar.f4442x, iArr, true);
    }

    @Override // g5.c
    public final void zaz(a aVar, String str, ArrayList arrayList) {
        g(aVar);
        w7.b.s(arrayList);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = ((Long) arrayList.get(i10)).longValue();
        }
        int i11 = aVar.f4442x;
        Parcel parcel = this.f4446b;
        int t02 = a0.t0(i11, parcel);
        parcel.writeLongArray(jArr);
        a0.u0(t02, parcel);
    }
}
