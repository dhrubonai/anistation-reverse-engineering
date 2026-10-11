package d;

import android.content.Intent;
import androidx.activity.j;
import androidx.fragment.app.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import o7.f;
import r6.h0;
import x6.i;
import x6.p;

/* loaded from: classes.dex */
public final class b extends a {
    @Override // d.a
    public final Intent a(j jVar, Object obj) {
        String[] strArr = (String[]) obj;
        h0.u(jVar, "context");
        h0.u(strArr, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        h0.s(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // d.a
    public final o b(j jVar, Object obj) {
        boolean z9;
        boolean z10;
        String[] strArr = (String[]) obj;
        h0.u(jVar, "context");
        h0.u(strArr, "input");
        boolean z11 = true;
        if (strArr.length == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return new o(p.f11319a);
        }
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (x.j.checkSelfPermission(jVar, strArr[i10]) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                z11 = false;
                break;
            }
            i10++;
        }
        if (z11) {
            int m02 = h0.m0(strArr.length);
            if (m02 < 16) {
                m02 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(m02);
            for (String str : strArr) {
                linkedHashMap.put(str, Boolean.TRUE);
            }
            return new o(linkedHashMap);
        }
        return null;
    }

    @Override // d.a
    public final Object c(Intent intent, int i10) {
        boolean z9;
        p pVar = p.f11319a;
        if (i10 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i11 : intArrayExtra) {
                    if (i11 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    arrayList.add(Boolean.valueOf(z9));
                }
                ArrayList l12 = i.l1(stringArrayExtra);
                Iterator it = l12.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(x6.j.o0(l12), x6.j.o0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new w6.b(it.next(), it2.next()));
                }
                return f.h1(arrayList2);
            }
            return pVar;
        }
        return pVar;
    }
}
