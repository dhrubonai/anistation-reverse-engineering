package com.anistation.model.watch;

import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
import defpackage.jb0;
import defpackage.kj5;
import defpackage.kq4;
import defpackage.l61;
import defpackage.qi2;
import defpackage.t80;
import defpackage.wd2;
import defpackage.wt1;
import defpackage.x73;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@de1
/* loaded from: classes.dex */
public final /* synthetic */ class Skips$$serializer implements wd2 {
    public static final Skips$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        Skips$$serializer skips$$serializer = new Skips$$serializer();
        INSTANCE = skips$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.watch.Skips", skips$$serializer, 2);
        kq4Var.j("intro", false);
        kq4Var.j("outro", false);
        descriptor = kq4Var;
    }

    private Skips$$serializer() {
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        SkipRange$$serializer skipRange$$serializer = SkipRange$$serializer.INSTANCE;
        return new x73[]{jb0.a(skipRange$$serializer), jb0.a(skipRange$$serializer)};
    }

    @Override // defpackage.ne1
    public final Skips deserialize(l61 l61Var) {
        SkipRange skipRange;
        int i;
        SkipRange skipRange2;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        kj5 kj5Var = null;
        if (c.decodeSequentially()) {
            SkipRange$$serializer skipRange$$serializer = SkipRange$$serializer.INSTANCE;
            skipRange2 = (SkipRange) c.decodeNullableSerializableElement(aj5Var, 0, skipRange$$serializer, null);
            skipRange = (SkipRange) c.decodeNullableSerializableElement(aj5Var, 1, skipRange$$serializer, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            skipRange = null;
            SkipRange skipRange3 = null;
            while (z) {
                int i3 = c.i(aj5Var);
                if (i3 != -1) {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            skipRange = (SkipRange) c.decodeNullableSerializableElement(aj5Var, 1, SkipRange$$serializer.INSTANCE, skipRange);
                            i2 |= 2;
                        } else {
                            qi2.f(i3);
                            return null;
                        }
                    } else {
                        skipRange3 = (SkipRange) c.decodeNullableSerializableElement(aj5Var, 0, SkipRange$$serializer.INSTANCE, skipRange3);
                        i2 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            i = i2;
            skipRange2 = skipRange3;
        }
        c.a(aj5Var);
        return new Skips(i, skipRange2, skipRange, kj5Var);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Skips skips) {
        wt1Var.getClass();
        skips.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        Skips.write$Self$AniStation_core_model(skips, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
