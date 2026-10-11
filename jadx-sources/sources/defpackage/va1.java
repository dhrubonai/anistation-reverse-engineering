package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.anistation.model.Recommendation;
import com.anistation.model.Relation;
import com.anistation.model.animelist.AnimeListImportProvider;
import com.anistation.model.animelist.WatchStatus;
import com.unity3d.ads.core.data.datasource.MaxAdRevenueListener;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class va1 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ va1(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31, types: [xz3] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [xz3] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [z44] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [z44] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // defpackage.sb2
    public final Object invoke() {
        Object value;
        String[] names;
        String str;
        byte b = this.x;
        ot1 ot1Var = ot1.x;
        Uri uri = null;
        int i = 1;
        pn6 pn6Var = pn6.a;
        Object obj = this.z;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                return new c13(w65.R(((q86) obj2).k((ha3) ((sb2) obj).invoke())));
            case 1:
                ((w86) obj2).d.invoke((b96) obj);
                return pn6Var;
            case 2:
                ub2 ub2Var = (ub2) obj2;
                Integer num = (Integer) obj;
                if (num != null) {
                    i = num.intValue();
                }
                ub2Var.invoke(Integer.valueOf(i));
                return pn6Var;
            case 3:
                sm3 sm3Var = (sm3) obj2;
                String externalLocationUri = ((pm1) ((w44) obj).getValue()).f.getExternalLocationUri();
                if (externalLocationUri != null) {
                    uri = Uri.parse(externalLocationUri);
                    uri.getClass();
                }
                sm3Var.a(uri);
                return pn6Var;
            case 4:
                sb2 sb2Var = (sb2) obj;
                sx5 sx5Var = ((tm1) obj2).d;
                do {
                    value = sx5Var.getValue();
                } while (!sx5Var.j(value, pm1.a((pm1) value, null, null, false, null, null, null, null, false, 253)));
                sb2Var.invoke();
                return pn6Var;
            case 5:
                Enum[] enumArr = ((uv1) obj2).a;
                rv1 rv1Var = new rv1((String) obj, enumArr.length);
                for (Enum r0 : enumArr) {
                    rv1Var.j(r0.name(), false);
                }
                return rv1Var;
            case 6:
                ((w05) obj2).x = t80.C((f82) obj, wl4.a);
                return pn6Var;
            case 7:
                ((w05) obj2).x = ((h82) obj).c1();
                return pn6Var;
            case 8:
                ((w05) obj2).x = t80.C((m82) obj, wl4.a);
                return pn6Var;
            case 9:
                k14 k14Var = (k14) obj;
                ((kd2) obj2).H(k14Var.a, k14Var.g, k14Var.b, true);
                return pn6Var;
            case 10:
                ((fl2) obj2).d((xz3) obj);
                return pn6Var;
            case 11:
                ((ub2) obj2).invoke((WatchStatus) obj);
                return pn6Var;
            case 12:
                ((ub2) obj2).invoke((AnimeListImportProvider) obj);
                return pn6Var;
            case 13:
                aj5 aj5Var = (aj5) obj2;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                m37.B((y43) obj, aj5Var);
                int e = aj5Var.e();
                for (int i2 = 0; i2 < e; i2++) {
                    List g = aj5Var.g(i2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : g) {
                        if (obj3 instanceof d63) {
                            arrayList.add(obj3);
                        }
                    }
                    d63 d63Var = (d63) yo0.A0(arrayList);
                    if (d63Var != null && (names = d63Var.names()) != null) {
                        for (String str2 : names) {
                            if (a34.i(aj5Var.getKind(), gj5.a)) {
                                str = "enum value";
                            } else {
                                str = "property";
                            }
                            if (!linkedHashMap.containsKey(str2)) {
                                linkedHashMap.put(str2, Integer.valueOf(i2));
                            } else {
                                throw new o53(iv.v(-1, "The suggested name '" + str2 + "' for " + str + ' ' + aj5Var.f(i2) + " is already one of the names for " + str + ' ' + aj5Var.f(((Number) vn3.Q(str2, linkedHashMap)).intValue()) + " in " + aj5Var, null, null, null));
                            }
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    return linkedHashMap;
                }
                return ot1Var;
            case 14:
                w05 w05Var = (w05) obj;
                kf kfVar = ((za3) obj2).c0;
                if ((((xz3) kfVar.D).A & 8) != 0) {
                    for (xz3 xz3Var = (z66) kfVar.C; xz3Var != null; xz3Var = xz3Var.B) {
                        if ((xz3Var.z & 8) != 0) {
                            zc1 zc1Var = xz3Var;
                            ?? r2 = 0;
                            while (zc1Var != 0) {
                                if (zc1Var instanceof sh5) {
                                    sh5 sh5Var = (sh5) zc1Var;
                                    if (sh5Var.K()) {
                                        ph5 ph5Var = new ph5();
                                        w05Var.x = ph5Var;
                                        ph5Var.A = true;
                                    }
                                    if (sh5Var.K0()) {
                                        ((ph5) w05Var.x).z = true;
                                    }
                                    sh5Var.I0((bi5) w05Var.x);
                                } else if ((zc1Var.z & 8) != 0 && (zc1Var instanceof zc1)) {
                                    xz3 xz3Var2 = zc1Var.M;
                                    int i3 = 0;
                                    zc1Var = zc1Var;
                                    r2 = r2;
                                    while (xz3Var2 != null) {
                                        if ((xz3Var2.z & 8) != 0) {
                                            i3++;
                                            r2 = r2;
                                            if (i3 == 1) {
                                                zc1Var = xz3Var2;
                                            } else {
                                                if (r2 == 0) {
                                                    r2 = new z44(new xz3[16], 0);
                                                }
                                                if (zc1Var != 0) {
                                                    r2.b(zc1Var);
                                                    zc1Var = 0;
                                                }
                                                r2.b(xz3Var2);
                                            }
                                        }
                                        xz3Var2 = xz3Var2.C;
                                        zc1Var = zc1Var;
                                        r2 = r2;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                zc1Var = wc7.J(r2);
                            }
                        }
                    }
                }
                return pn6Var;
            case 15:
                wc3 wc3Var = (wc3) obj;
                bc3 bc3Var = (bc3) ((he1) obj2).getValue();
                return new dc3(wc3Var, bc3Var, new eb2((f13) wc3Var.d.f.getValue(), bc3Var));
            case 16:
                return new df3((n95) obj2, ot1Var, (j95) obj);
            case 17:
                return LegacyLoadUseCase.b((LegacyLoadUseCase) obj2, (AdObject) obj);
            case 18:
                return LegacyLoadUseCase.a((LegacyLoadUseCase) obj2, (LoadResult.Failure) obj);
            case 19:
                return MaxAdRevenueListener.b((MaxAdRevenueListener) obj2, (Bundle) obj);
            case 20:
                kb5 kb5Var = (kb5) obj2;
                sb2 sb2Var2 = (sb2) obj;
                int size = kb5Var.a.size() - kb5Var.c.c.size();
                for (int i4 = 0; i4 < size; i4++) {
                    sb2Var2.invoke();
                }
                return pn6Var;
            case 21:
                b05 b05Var = (b05) obj;
                if (((nu) ((st3) obj2).x).get() == 0) {
                    b05Var.invoke();
                }
                return pn6Var;
            case 22:
                return dj5.buildSerialDescriptor((String) obj2, f06.d, new aj5[0], new pz3(obj, (byte) 6));
            case 23:
                ((ub2) obj2).invoke(Long.valueOf(((pi4) obj).h()));
                return pn6Var;
            case 24:
                return new File(((Context) obj2).getApplicationContext().getFilesDir(), "datastore/".concat(((ss4) obj).a.concat(".preferences_pb")));
            case 25:
                ub2 ub2Var2 = (ub2) obj2;
                Recommendation recommendation = (Recommendation) obj;
                String id = recommendation.getId();
                if (id == null) {
                    id = String.valueOf(recommendation.getAnilistId());
                }
                ub2Var2.invoke(id);
                return pn6Var;
            case 26:
                q44 q44Var = (q44) obj2;
                vu0 vu0Var = (vu0) obj;
                Object[] objArr = q44Var.b;
                long[] jArr = q44Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((255 & j) < 128) {
                                    vu0Var.A(objArr[(i5 << 3) + i7]);
                                }
                                j >>= 8;
                            }
                            if (i6 != 8) {
                            }
                        }
                        if (i5 != length) {
                            i5++;
                        }
                    }
                }
                return pn6Var;
            case 27:
                String str3 = (String) obj;
                Matcher matcher = ((c15) obj2).x.matcher(str3);
                matcher.getClass();
                if (!matcher.find(0)) {
                    return null;
                }
                return new do3(matcher, str3);
            case 28:
                Relation relation = (Relation) obj;
                ((ub2) obj2).invoke(vc2.a(relation.getAnilistId(), relation.getId()));
                return pn6Var;
            default:
                ((l55) obj2).A = (m55) obj;
                return pn6Var;
        }
    }
}
