package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u92 {
    public final /* synthetic */ byte a;
    public List b;
    public boolean c;

    public u92(ArrayList arrayList, boolean z) {
        this.a = (byte) 1;
        if (arrayList.isEmpty()) {
            this.b = Collections.EMPTY_LIST;
        } else {
            this.b = Collections.unmodifiableList(new ArrayList(arrayList));
        }
        this.c = z;
    }

    public static u92 a(Bundle bundle) {
        cs3 cs3Var;
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                if (bundle2 != null) {
                    cs3Var = new cs3(bundle2);
                } else {
                    cs3Var = null;
                }
                arrayList.add(cs3Var);
            }
        }
        return new u92(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = this.b;
                sb.append(Arrays.toString(list.toArray()));
                sb.append(", isValid=");
                int size = list.size();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i < size) {
                        cs3 cs3Var = (cs3) list.get(i);
                        if (cs3Var != null && cs3Var.e()) {
                            i++;
                        }
                    } else {
                        z = true;
                    }
                }
                return qx1.r(sb, z, " }");
            default:
                return super.toString();
        }
    }

    public u92(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                return;
            default:
                this.c = true;
                this.b = Collections.singletonList(null);
                return;
        }
    }

    public u92(ArrayList arrayList) {
        this.a = (byte) 0;
        this.c = false;
        this.b = arrayList;
    }
}
