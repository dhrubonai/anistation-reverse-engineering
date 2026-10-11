package defpackage;

import android.graphics.PathMeasure;
import com.anistation.model.Recent;
import com.anistation.model.Recommendation;
import com.anistation.model.Relation;
import com.anistation.model.download.OfflineDownloadMetadata;
import com.anistation.navigation.Route;
import com.anistation.remote.model.Response;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class qa4 implements sb2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ qa4(byte b) {
        this.x = b;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        x73 _childSerializers$_anonymous_;
        x73 _childSerializers$_anonymous_$0;
        x73 _childSerializers$_anonymous_$1;
        nn4 nn4Var;
        x73 _childSerializers$_anonymous_2;
        x73 _childSerializers$_anonymous_$02;
        x73 _childSerializers$_anonymous_$12;
        x73 _init_$_anonymous_;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        int i = 0;
        switch (b) {
            case 0:
                return sa4.b();
            case 1:
                _childSerializers$_anonymous_ = OfflineDownloadMetadata._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 2:
                _childSerializers$_anonymous_$0 = OfflineDownloadMetadata._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 3:
                _childSerializers$_anonymous_$1 = OfflineDownloadMetadata._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 4:
                return new pf0(new jd4());
            case 5:
                return new dh4();
            case 6:
                return new jd(new PathMeasure());
            case 7:
                return null;
            case 8:
                ja1 ja1Var = rh1.a;
                return j91.y;
            case 9:
                return null;
            case 10:
                nn4 nn4Var2 = nn4.c;
                String property = System.getProperty("java.version");
                property.getClass();
                try {
                    List h0 = uz5.h0(property, new char[]{'-', '_'}, 6);
                    if (h0.size() == 2) {
                        nn4Var = new nn4((String) h0.get(0), Integer.parseInt((String) h0.get(1)));
                    } else {
                        nn4Var = new nn4(property, -1);
                    }
                    return nn4Var;
                } catch (Throwable unused) {
                    return nn4.c;
                }
            case 11:
                return xt5.g(Boolean.FALSE);
            case 12:
                return pn6Var;
            case 13:
                return new mx4(new wj(Float.valueOf(0.0f), db.l, null, 12));
            case 14:
                List C0 = yo0.C0((List) yj5.a.getValue(), new k82((byte) 25));
                ArrayList arrayList = new ArrayList();
                int size = C0.size();
                while (i < size) {
                    ((ld4) C0.get(i)).getClass();
                    arrayList.add(new ai4(new v84(new qa4((byte) 4)), z05.a(lp6.class)));
                    i++;
                }
                return arrayList;
            case 15:
                List C02 = yo0.C0((List) yj5.b.getValue(), new k82((byte) 26));
                ArrayList arrayList2 = new ArrayList();
                int size2 = C02.size();
                while (i < size2) {
                    ((je2) C02.get(i)).getClass();
                    arrayList2.add(new sk());
                    i++;
                }
                return arrayList2;
            case 16:
                return null;
            case 17:
                _childSerializers$_anonymous_2 = Recent._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 18:
                _childSerializers$_anonymous_$02 = Recent._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 19:
                _childSerializers$_anonymous_$12 = Recent._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case 20:
                return Recommendation.b();
            case 21:
                return Recommendation.a();
            case 22:
                return Recommendation.c();
            case 23:
                return Relation.b();
            case 24:
                return Relation.a();
            case 25:
                return Relation.c();
            case 26:
                return pn6Var;
            case 27:
                return Response.a();
            case 28:
                return new g65();
            default:
                _init_$_anonymous_ = Route.About._init_$_anonymous_();
                return _init_$_anonymous_;
        }
    }
}
