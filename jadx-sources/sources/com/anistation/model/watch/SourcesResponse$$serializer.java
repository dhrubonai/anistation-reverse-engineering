package com.anistation.model.watch;

import com.anistation.model.watch.shiro.ShiroPlaybackPlan;
import com.anistation.model.watch.shiro.ShiroPlaybackPlan$$serializer;
import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
import defpackage.jb0;
import defpackage.kj5;
import defpackage.kq4;
import defpackage.l61;
import defpackage.ne1;
import defpackage.qi2;
import defpackage.rb3;
import defpackage.t80;
import defpackage.wd2;
import defpackage.wt1;
import defpackage.x73;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@de1
/* loaded from: classes.dex */
public final /* synthetic */ class SourcesResponse$$serializer implements wd2 {
    public static final SourcesResponse$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        SourcesResponse$$serializer sourcesResponse$$serializer = new SourcesResponse$$serializer();
        INSTANCE = sourcesResponse$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.watch.SourcesResponse", sourcesResponse$$serializer, 6);
        kq4Var.j("sources", false);
        kq4Var.j("tracks", false);
        kq4Var.j("skips", false);
        kq4Var.j("downloads", true);
        kq4Var.j("headers", false);
        kq4Var.j("playback", true);
        descriptor = kq4Var;
    }

    private SourcesResponse$$serializer() {
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        rb3[] rb3VarArr;
        rb3VarArr = SourcesResponse.$childSerializers;
        return new x73[]{jb0.a((x73) rb3VarArr[0].getValue()), jb0.a((x73) rb3VarArr[1].getValue()), jb0.a(Skips$$serializer.INSTANCE), jb0.a((x73) rb3VarArr[3].getValue()), jb0.a((x73) rb3VarArr[4].getValue()), jb0.a(ShiroPlaybackPlan$$serializer.INSTANCE)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0087. Please report as an issue. */
    @Override // defpackage.ne1
    public final SourcesResponse deserialize(l61 l61Var) {
        rb3[] rb3VarArr;
        Map map;
        List list;
        List list2;
        ShiroPlaybackPlan shiroPlaybackPlan;
        Skips skips;
        List list3;
        int i;
        int i2;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        rb3VarArr = SourcesResponse.$childSerializers;
        int i3 = 5;
        int i4 = 0;
        List list4 = null;
        if (c.decodeSequentially()) {
            List list5 = (List) c.decodeNullableSerializableElement(aj5Var, 0, (ne1) rb3VarArr[0].getValue(), null);
            List list6 = (List) c.decodeNullableSerializableElement(aj5Var, 1, (ne1) rb3VarArr[1].getValue(), null);
            Skips skips2 = (Skips) c.decodeNullableSerializableElement(aj5Var, 2, Skips$$serializer.INSTANCE, null);
            List list7 = (List) c.decodeNullableSerializableElement(aj5Var, 3, (ne1) rb3VarArr[3].getValue(), null);
            map = (Map) c.decodeNullableSerializableElement(aj5Var, 4, (ne1) rb3VarArr[4].getValue(), null);
            list2 = list5;
            shiroPlaybackPlan = (ShiroPlaybackPlan) c.decodeNullableSerializableElement(aj5Var, 5, ShiroPlaybackPlan$$serializer.INSTANCE, null);
            skips = skips2;
            list3 = list7;
            i = 63;
            list = list6;
        } else {
            int i5 = 1;
            int i6 = 0;
            Map map2 = null;
            List list8 = null;
            ShiroPlaybackPlan shiroPlaybackPlan2 = null;
            Skips skips3 = null;
            List list9 = null;
            while (i5 != 0) {
                int i7 = c.i(aj5Var);
                switch (i7) {
                    case -1:
                        i5 = i4;
                        i3 = 5;
                    case 0:
                        int i8 = i4;
                        list8 = (List) c.decodeNullableSerializableElement(aj5Var, i8, (ne1) rb3VarArr[i8].getValue(), list8);
                        i6 |= 1;
                        i4 = i8;
                        i3 = 5;
                    case 1:
                        i2 = i4;
                        list4 = (List) c.decodeNullableSerializableElement(aj5Var, 1, (ne1) rb3VarArr[1].getValue(), list4);
                        i6 |= 2;
                        i4 = i2;
                    case 2:
                        i2 = i4;
                        skips3 = (Skips) c.decodeNullableSerializableElement(aj5Var, 2, Skips$$serializer.INSTANCE, skips3);
                        i6 |= 4;
                        i4 = i2;
                    case 3:
                        i2 = i4;
                        list9 = (List) c.decodeNullableSerializableElement(aj5Var, 3, (ne1) rb3VarArr[3].getValue(), list9);
                        i6 |= 8;
                        i4 = i2;
                    case 4:
                        i2 = i4;
                        map2 = (Map) c.decodeNullableSerializableElement(aj5Var, 4, (ne1) rb3VarArr[4].getValue(), map2);
                        i6 |= 16;
                        i4 = i2;
                    case 5:
                        i2 = i4;
                        shiroPlaybackPlan2 = (ShiroPlaybackPlan) c.decodeNullableSerializableElement(aj5Var, i3, ShiroPlaybackPlan$$serializer.INSTANCE, shiroPlaybackPlan2);
                        i6 |= 32;
                        i4 = i2;
                    default:
                        qi2.f(i7);
                        return null;
                }
            }
            map = map2;
            list = list4;
            list2 = list8;
            shiroPlaybackPlan = shiroPlaybackPlan2;
            skips = skips3;
            list3 = list9;
            i = i6;
        }
        c.a(aj5Var);
        return new SourcesResponse(i, list2, list, skips, list3, map, shiroPlaybackPlan, (kj5) null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, SourcesResponse sourcesResponse) {
        wt1Var.getClass();
        sourcesResponse.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        SourcesResponse.write$Self$AniStation_core_model(sourcesResponse, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
