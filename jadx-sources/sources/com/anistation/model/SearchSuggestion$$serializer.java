package com.anistation.model;

import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
import defpackage.jb0;
import defpackage.kj5;
import defpackage.kq4;
import defpackage.l61;
import defpackage.mz5;
import defpackage.qi2;
import defpackage.t80;
import defpackage.wd2;
import defpackage.wt1;
import defpackage.x73;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@de1
/* loaded from: classes.dex */
public final /* synthetic */ class SearchSuggestion$$serializer implements wd2 {
    public static final SearchSuggestion$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        SearchSuggestion$$serializer searchSuggestion$$serializer = new SearchSuggestion$$serializer();
        INSTANCE = searchSuggestion$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.SearchSuggestion", searchSuggestion$$serializer, 3);
        kq4Var.j("id", false);
        kq4Var.j("title", false);
        kq4Var.j("thumbnailImage", true);
        descriptor = kq4Var;
    }

    private SearchSuggestion$$serializer() {
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        mz5 mz5Var = mz5.a;
        return new x73[]{mz5Var, mz5Var, jb0.a(mz5Var)};
    }

    @Override // defpackage.ne1
    public final SearchSuggestion deserialize(l61 l61Var) {
        String str;
        String str2;
        String str3;
        int i;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        if (c.decodeSequentially()) {
            str = c.m(aj5Var, 0);
            String m = c.m(aj5Var, 1);
            str2 = (String) c.decodeNullableSerializableElement(aj5Var, 2, mz5.a, null);
            str3 = m;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            str = null;
            String str4 = null;
            String str5 = null;
            while (z) {
                int i3 = c.i(aj5Var);
                if (i3 != -1) {
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                str4 = (String) c.decodeNullableSerializableElement(aj5Var, 2, mz5.a, str4);
                                i2 |= 4;
                            } else {
                                qi2.f(i3);
                                return null;
                            }
                        } else {
                            str5 = c.m(aj5Var, 1);
                            i2 |= 2;
                        }
                    } else {
                        str = c.m(aj5Var, 0);
                        i2 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            str2 = str4;
            str3 = str5;
            i = i2;
        }
        String str6 = str;
        c.a(aj5Var);
        return new SearchSuggestion(i, str6, str3, str2, (kj5) null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, SearchSuggestion searchSuggestion) {
        wt1Var.getClass();
        searchSuggestion.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        SearchSuggestion.write$Self$AniStation_core_model(searchSuggestion, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
