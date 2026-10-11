package o7;

import h7.p;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import r6.h0;

/* loaded from: classes.dex */
public final class i extends i7.h implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8329b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8330c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, Object obj, boolean z9) {
        super(2);
        this.f8328a = i10;
        this.f8330c = obj;
        this.f8329b = z9;
    }

    public final w6.b b(int i10, CharSequence charSequence) {
        Object obj;
        w6.b bVar;
        Object obj2;
        int i11 = this.f8328a;
        Object obj3 = this.f8330c;
        switch (i11) {
            case 0:
                h0.u(charSequence, "$this$$receiver");
                int r12 = j.r1(i10, charSequence, this.f8329b, (char[]) obj3);
                if (r12 < 0) {
                    return null;
                }
                return new w6.b(Integer.valueOf(r12), 1);
            default:
                h0.u(charSequence, "$this$$receiver");
                List list = (List) obj3;
                boolean z9 = this.f8329b;
                if (!z9 && list.size() == 1) {
                    int size = list.size();
                    if (size != 0) {
                        if (size == 1) {
                            String str = (String) list.get(0);
                            int q12 = j.q1(charSequence, str, i10, false, 4);
                            if (q12 >= 0) {
                                bVar = new w6.b(Integer.valueOf(q12), str);
                            }
                            bVar = null;
                        } else {
                            throw new IllegalArgumentException("List has more than one element.");
                        }
                    } else {
                        throw new NoSuchElementException("List is empty.");
                    }
                } else {
                    if (i10 < 0) {
                        i10 = 0;
                    }
                    l7.f fVar = new l7.f(i10, charSequence.length());
                    boolean z10 = charSequence instanceof String;
                    int i12 = fVar.f6884c;
                    int i13 = fVar.f6883b;
                    if (z10) {
                        if ((i12 > 0 && i10 <= i13) || (i12 < 0 && i13 <= i10)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        String str2 = (String) obj2;
                                        if (j.v1(0, i10, str2.length(), str2, (String) charSequence, z9)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                String str3 = (String) obj2;
                                if (str3 != null) {
                                    bVar = new w6.b(Integer.valueOf(i10), str3);
                                } else if (i10 != i13) {
                                    i10 += i12;
                                }
                            }
                        }
                        bVar = null;
                    } else {
                        if ((i12 > 0 && i10 <= i13) || (i12 < 0 && i13 <= i10)) {
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj = it2.next();
                                        String str4 = (String) obj;
                                        if (j.w1(str4, 0, charSequence, i10, str4.length(), z9)) {
                                        }
                                    } else {
                                        obj = null;
                                    }
                                }
                                String str5 = (String) obj;
                                if (str5 != null) {
                                    bVar = new w6.b(Integer.valueOf(i10), str5);
                                } else if (i10 != i13) {
                                    i10 += i12;
                                }
                            }
                        }
                        bVar = null;
                    }
                }
                if (bVar == null) {
                    return null;
                }
                return new w6.b(bVar.f11012a, Integer.valueOf(((String) bVar.f11013b).length()));
        }
    }

    @Override // h7.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8328a) {
            case 0:
                return b(((Number) obj2).intValue(), (CharSequence) obj);
            case 1:
                return b(((Number) obj2).intValue(), (CharSequence) obj);
            default:
                return ((z6.i) obj).t((z6.g) obj2);
        }
    }
}
