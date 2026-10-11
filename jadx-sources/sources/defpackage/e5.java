package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e5 extends z4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f5 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ x4 d;

    public /* synthetic */ e5(f5 f5Var, String str, x4 x4Var, byte b) {
        this.a = b;
        this.b = f5Var;
        this.c = str;
        this.d = x4Var;
    }

    @Override // defpackage.z4
    public final void a(Object obj) {
        byte b = this.a;
        x4 x4Var = this.d;
        String str = this.c;
        f5 f5Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = f5Var.d;
                Object obj2 = f5Var.b.get(str);
                if (obj2 != null) {
                    int intValue = ((Number) obj2).intValue();
                    arrayList.add(str);
                    try {
                        f5Var.b(intValue, x4Var, obj);
                        return;
                    } catch (Exception e) {
                        arrayList.remove(str);
                        throw e;
                    }
                }
                ov3.i("Attempting to launch an unregistered ActivityResultLauncher with contract ", x4Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
            default:
                LinkedHashMap linkedHashMap = f5Var.b;
                ArrayList arrayList2 = f5Var.d;
                Object obj3 = linkedHashMap.get(str);
                if (obj3 != null) {
                    int intValue2 = ((Number) obj3).intValue();
                    arrayList2.add(str);
                    try {
                        f5Var.b(intValue2, x4Var, obj);
                        return;
                    } catch (Exception e2) {
                        arrayList2.remove(str);
                        throw e2;
                    }
                }
                ov3.i("Attempting to launch an unregistered ActivityResultLauncher with contract ", x4Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
        }
    }
}
