package w7;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f11020a;

    static {
        ArrayList arrayList = new ArrayList();
        String[][] strArr = c8.b.f2081b;
        for (int i10 = 0; i10 < 11; i10++) {
            arrayList.add(strArr[i10][0]);
        }
        f11020a = arrayList;
    }

    public static ArrayList a(Context context) {
        ArrayList arrayList = f11020a;
        String string = context.getSharedPreferences("pistream_home_layout", 0).getString("row_order", null);
        if (string == null) {
            return new ArrayList(arrayList);
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string2 = jSONArray.getString(i10);
                if (arrayList.contains(string2) && !arrayList2.contains(string2)) {
                    arrayList2.add(string2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!arrayList2.contains(str)) {
                    arrayList2.add(str);
                }
            }
            if (arrayList2.isEmpty()) {
                return new ArrayList(arrayList);
            }
            return arrayList2;
        } catch (Exception unused) {
            return new ArrayList(arrayList);
        }
    }
}
