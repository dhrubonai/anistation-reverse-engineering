package defpackage;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.anistation.model.Page;
import com.anistation.model.Resource;
import com.anistation.model.settings.SubtitleStyleSettings;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xg extends t36 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xg(Object obj, Object obj2, Object obj3, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.A;
        Object obj3 = this.z;
        switch (b) {
            case 0:
                return new xg((ic2) this.y, (pi4) obj3, (pi4) obj2, vz0Var, (byte) 0);
            case 1:
                return new xg((Drawable) this.y, (sb2) obj3, (sb2) obj2, vz0Var, (byte) 1);
            case 2:
                return new xg((String) this.y, (rs) obj3, (String) obj2, vz0Var, (byte) 2);
            case 3:
                return new xg((List) this.y, (w44) obj3, (w44) obj2, vz0Var, (byte) 3);
            case 4:
                xg xgVar = new xg((String) obj3, (String) obj2, vz0Var, (byte) 4);
                xgVar.y = obj;
                return xgVar;
            case 5:
                xg xgVar2 = new xg((yq4) obj3, (k96) obj2, vz0Var, (byte) 5);
                xgVar2.y = obj;
                return xgVar2;
            case 6:
                xg xgVar3 = new xg((sb5) obj3, (String) obj2, vz0Var, (byte) 6);
                xgVar3.y = obj;
                return xgVar3;
            case 7:
                return new xg((px5) this.y, (wm6) obj3, (sb2) obj2, vz0Var, (byte) 7);
            case 8:
                return new xg((wc3) this.y, (af3) obj3, (p72) obj2, vz0Var, (byte) 8);
            case 9:
                xg xgVar4 = new xg((fa6) obj3, (yq4) obj2, vz0Var, (byte) 9);
                xgVar4.y = obj;
                return xgVar4;
            case 10:
                xg xgVar5 = new xg((cc6) obj3, (yq4) obj2, vz0Var, (byte) 10);
                xgVar5.y = obj;
                return xgVar5;
            case 11:
                xg xgVar6 = new xg((rt6) obj3, (SubtitleStyleSettings) obj2, vz0Var, (byte) 11);
                xgVar6.y = obj;
                return xgVar6;
            default:
                return new xg((String) this.y, (List) obj3, (w44) obj2, vz0Var, (byte) 12);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                ((xg) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 1:
                ((xg) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 2:
                return ((xg) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 3:
                ((xg) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 4:
                ((xg) create((j44) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 5:
                return ((xg) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 6:
                ((xg) create((Resource) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 7:
                ((xg) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 8:
                ((xg) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 9:
                ((xg) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 10:
                return ((xg) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 11:
                ((xg) create((j44) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                ((xg) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        t45 t45Var;
        Object value;
        vm6 vm6Var;
        LinkedHashMap linkedHashMap;
        Page page;
        byte b = this.x;
        byte b2 = 2;
        y11 y11Var = y11.A;
        vz0 vz0Var = null;
        byte b3 = 1;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.z;
        Object obj3 = this.A;
        switch (b) {
            case 0:
                m37.N(obj);
                ((ic2) this.y).invoke(new Float(((pi4) obj2).h()), new Float(((pi4) obj3).h()));
                return pn6Var;
            case 1:
                m37.N(obj);
                ((AnimatedImageDrawable) ((Drawable) this.y)).registerAnimationCallback(new gq6((sb2) obj2, (sb2) obj3));
                return pn6Var;
            case 2:
                String str = (String) obj3;
                rs rsVar = (rs) obj2;
                File file = rsVar.b;
                m37.N(obj);
                String str2 = (String) this.y;
                if (str2 == null || uz5.V(str2)) {
                    return null;
                }
                File file2 = new File(file, str);
                if (!file2.exists() || file2.length() <= 0) {
                    File file3 = new File(file, str.concat(".partial"));
                    try {
                        kz kzVar = new kz((byte) 8);
                        kzVar.E(str2);
                        l35 r = kzVar.r();
                        jd4 jd4Var = rsVar.a;
                        jd4Var.getClass();
                        p45 e = new bz4(jd4Var, r).e();
                        try {
                            if (e.l() && (t45Var = e.D) != null) {
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3), 8192);
                                try {
                                    InputStream a = t45Var.a();
                                    try {
                                        kb0.o(a, bufferedOutputStream);
                                        a.close();
                                        bufferedOutputStream.close();
                                        e.close();
                                        if (file2.exists()) {
                                            file2.delete();
                                        }
                                        if (!file3.renameTo(file2)) {
                                            file3.delete();
                                            return null;
                                        }
                                    } finally {
                                    }
                                } finally {
                                }
                            }
                            e.close();
                            return null;
                        } finally {
                        }
                    } catch (Throwable unused) {
                        file3.delete();
                        return null;
                    }
                }
                return file2;
            case 3:
                m37.N(obj);
                if (((List) this.y).isEmpty()) {
                    ((w44) obj2).setValue(Boolean.FALSE);
                    ((w44) obj3).setValue(tt1.x);
                }
                return pn6Var;
            case 4:
                j44 j44Var = (j44) this.y;
                m37.N(obj);
                ts4 ts4Var = zl1.c;
                j44Var.e(zl1.d, (String) obj2);
                j44Var.e(zl1.e, (String) obj3);
                return pn6Var;
            case 5:
                m37.N(obj);
                v11 v11Var = (v11) this.y;
                yq4 yq4Var = (yq4) obj2;
                k96 k96Var = (k96) obj3;
                tl7.z(v11Var, null, y11Var, new y01(yq4Var, k96Var, vz0Var, b3), 1);
                return tl7.z(v11Var, null, y11Var, new y01(yq4Var, k96Var, vz0Var, b2), 1);
            case 6:
                Resource resource = (Resource) this.y;
                m37.N(obj);
                sx5 sx5Var = ((sb5) obj2).c;
                String str3 = (String) obj3;
                do {
                    value = sx5Var.getValue();
                    vm6Var = (vm6) value;
                    Map map = vm6Var.e;
                    map.getClass();
                    if (map.isEmpty()) {
                        ?? singletonMap = Collections.singletonMap(str3, resource);
                        singletonMap.getClass();
                        linkedHashMap = singletonMap;
                    } else {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
                        linkedHashMap2.put(str3, resource);
                        linkedHashMap = linkedHashMap2;
                    }
                } while (!sx5Var.j(value, vm6.a(vm6Var, null, 0L, 0L, null, linkedHashMap, 15)));
                return pn6Var;
            case 7:
                m37.N(obj);
                if (((Boolean) ((px5) this.y).getValue()).booleanValue()) {
                    wm6 wm6Var = (wm6) obj2;
                    if (!wm6Var.c && !wm6Var.d && (page = wm6Var.e) != null && page.getHasNextPage()) {
                        ((sb2) obj3).invoke();
                    }
                }
                return pn6Var;
            case 8:
                m37.N(obj);
                if (((wc3) this.y).h.a() || ((af3) obj2).j.a()) {
                    p72.a((p72) obj3);
                }
                return pn6Var;
            case 9:
                m37.N(obj);
                v11 v11Var2 = (v11) this.y;
                fa6 fa6Var = (fa6) obj2;
                cc6 cc6Var = fa6Var.P;
                yq4 yq4Var2 = (yq4) obj3;
                lb5 lb5Var = new lb5((Object) cc6Var, (Object) fa6Var, (byte) 12);
                vz0 vz0Var2 = null;
                tl7.z(v11Var2, null, y11Var, new da6(cc6Var, yq4Var2, vz0Var2, (byte) 0), 1);
                tl7.z(v11Var2, null, y11Var, new l5(fa6Var, cc6Var, yq4Var2, lb5Var, null, (byte) 17), 1);
                tl7.z(v11Var2, null, y11Var, new e05(cc6Var, yq4Var2, lb5Var, vz0Var2, (byte) 10), 1);
                return pn6Var;
            case 10:
                m37.N(obj);
                v11 v11Var3 = (v11) this.y;
                cc6 cc6Var2 = (cc6) obj2;
                yq4 yq4Var3 = (yq4) obj3;
                tl7.z(v11Var3, null, y11Var, new da6(cc6Var2, yq4Var3, vz0Var, b3), 1);
                tl7.z(v11Var3, null, y11Var, new da6(cc6Var2, yq4Var3, vz0Var, b2), 1);
                return tl7.z(v11Var3, null, y11Var, new da6(yq4Var3, cc6Var2, null), 1);
            case 11:
                SubtitleStyleSettings subtitleStyleSettings = (SubtitleStyleSettings) obj3;
                j44 j44Var2 = (j44) this.y;
                m37.N(obj);
                ts4 ts4Var2 = av6.b;
                rt6 rt6Var = (rt6) obj2;
                Boolean bool = rt6Var.a;
                w73[] w73VarArr = bv6.a;
                if (bool == null) {
                    j44Var2.d(ts4Var2);
                } else {
                    j44Var2.e(ts4Var2, bool);
                }
                ts4 ts4Var3 = av6.k;
                String str4 = rt6Var.b;
                if (str4 == null) {
                    j44Var2.d(ts4Var3);
                } else {
                    j44Var2.e(ts4Var3, str4);
                }
                ts4 ts4Var4 = av6.c;
                Boolean bool2 = rt6Var.c;
                if (bool2 == null) {
                    j44Var2.d(ts4Var4);
                } else {
                    j44Var2.e(ts4Var4, bool2);
                }
                ts4 ts4Var5 = av6.d;
                Boolean bool3 = rt6Var.d;
                if (bool3 == null) {
                    j44Var2.d(ts4Var5);
                } else {
                    j44Var2.e(ts4Var5, bool3);
                }
                ts4 ts4Var6 = av6.e;
                Boolean bool4 = rt6Var.e;
                if (bool4 == null) {
                    j44Var2.d(ts4Var6);
                } else {
                    j44Var2.e(ts4Var6, bool4);
                }
                ts4 ts4Var7 = av6.f;
                Boolean bool5 = rt6Var.f;
                if (bool5 == null) {
                    j44Var2.d(ts4Var7);
                } else {
                    j44Var2.e(ts4Var7, bool5);
                }
                ts4 ts4Var8 = av6.g;
                String str5 = rt6Var.g;
                if (str5 == null) {
                    j44Var2.d(ts4Var8);
                } else {
                    j44Var2.e(ts4Var8, str5);
                }
                ts4 ts4Var9 = av6.h;
                String str6 = rt6Var.k;
                if (str6 == null) {
                    j44Var2.d(ts4Var9);
                } else {
                    j44Var2.e(ts4Var9, str6);
                }
                ts4 ts4Var10 = av6.i;
                String str7 = rt6Var.h;
                if (str7 == null) {
                    j44Var2.d(ts4Var10);
                } else {
                    j44Var2.e(ts4Var10, str7);
                }
                ts4 ts4Var11 = av6.j;
                String str8 = rt6Var.i;
                if (str8 == null) {
                    j44Var2.d(ts4Var11);
                } else {
                    j44Var2.e(ts4Var11, str8);
                }
                j44Var2.e(av6.l, new Float(subtitleStyleSettings.getFontScale()));
                j44Var2.e(av6.m, new Float(subtitleStyleSettings.getVerticalPosition()));
                j44Var2.e(av6.n, new Float(subtitleStyleSettings.getOutlineWidthDp()));
                j44Var2.e(av6.o, new Integer(subtitleStyleSettings.getTextColorArgb()));
                j44Var2.e(av6.p, new Integer(subtitleStyleSettings.getOutlineColorArgb()));
                j44Var2.e(av6.q, subtitleStyleSettings.getFontFamily().getId());
                j44Var2.e(av6.r, Boolean.valueOf(subtitleStyleSettings.isBold()));
                return pn6Var;
            default:
                w44 w44Var = (w44) obj3;
                m37.N(obj);
                String str9 = (String) this.y;
                if ((str9 != null || (str9 = (String) yo0.m0((List) obj2)) != null) && !a34.i((String) w44Var.getValue(), str9)) {
                    w44Var.setValue(str9);
                }
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xg(Object obj, Object obj2, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = obj;
        this.A = obj2;
    }
}
