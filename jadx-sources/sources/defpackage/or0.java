package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class or0 implements da5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ or0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.da5
    public final Bundle a() {
        ArrayList<? extends Parcelable> arrayList;
        ai4[] ai4VarArr;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return yr0.b((yr0) obj);
            case 1:
                Map c = ((o95) obj).c();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : c.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list instanceof ArrayList) {
                        arrayList = (ArrayList) list;
                    } else {
                        arrayList = new ArrayList<>(list);
                    }
                    bundle.putParcelableArrayList(str, arrayList);
                }
                return bundle;
            default:
                kz kzVar = (kz) obj;
                for (Map.Entry entry2 : vn3.Z((LinkedHashMap) kzVar.A).entrySet()) {
                    kzVar.D(((sx5) ((x44) entry2.getValue())).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : vn3.Z((LinkedHashMap) kzVar.y).entrySet()) {
                    kzVar.D(((da5) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) kzVar.x;
                if (linkedHashMap.isEmpty()) {
                    ai4VarArr = new ai4[0];
                } else {
                    ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList2.add(new ai4((String) entry4.getKey(), entry4.getValue()));
                    }
                    ai4VarArr = (ai4[]) arrayList2.toArray(new ai4[0]);
                }
                return h98.g((ai4[]) Arrays.copyOf(ai4VarArr, ai4VarArr.length));
        }
    }
}
