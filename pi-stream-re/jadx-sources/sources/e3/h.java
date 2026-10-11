package e3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import f1.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class h implements y2.d {

    /* renamed from: a, reason: collision with root package name */
    public final c f3460a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f3461b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f3462c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f3463d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f3464e;

    public h(c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f3460a = cVar;
        this.f3463d = hashMap2;
        this.f3464e = hashMap3;
        this.f3462c = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.f3461b = jArr;
    }

    @Override // y2.d
    public final int a(long j4) {
        long[] jArr = this.f3461b;
        int b10 = b0.b(jArr, j4, false);
        if (b10 >= jArr.length) {
            return -1;
        }
        return b10;
    }

    @Override // y2.d
    public final long b(int i10) {
        return this.f3461b[i10];
    }

    @Override // y2.d
    public final List c(long j4) {
        Map map = this.f3462c;
        Map map2 = this.f3463d;
        c cVar = this.f3460a;
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        cVar.g(j4, cVar.f3414h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j4, false, cVar.f3414h, treeMap);
        cVar.h(j4, map, map2, cVar.f3414h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) this.f3464e.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                f fVar = (f) map2.get(pair.first);
                fVar.getClass();
                arrayList2.add(new e1.b(null, null, null, decodeByteArray, fVar.f3434c, 0, fVar.f3436e, fVar.f3433b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f3437f, fVar.f3438g, false, -16777216, fVar.f3441j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            f fVar2 = (f) map2.get(entry.getKey());
            fVar2.getClass();
            e1.a aVar = (e1.a) entry.getValue();
            CharSequence charSequence = aVar.f3322a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (a aVar2 : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) "");
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    int i15 = i14 + 1;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        spannableStringBuilder.delete(i15, i14 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == '\n') {
                        spannableStringBuilder.delete(i16, i17);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            aVar.f3326e = fVar2.f3434c;
            aVar.f3327f = fVar2.f3435d;
            aVar.f3328g = fVar2.f3436e;
            aVar.f3329h = fVar2.f3433b;
            aVar.f3333l = fVar2.f3437f;
            aVar.f3332k = fVar2.f3440i;
            aVar.f3331j = fVar2.f3439h;
            aVar.f3336p = fVar2.f3441j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override // y2.d
    public final int d() {
        return this.f3461b.length;
    }
}
