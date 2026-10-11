package defpackage;

import androidx.work.impl.model.DependencyDao_Impl;
import androidx.work.impl.model.PreferenceDao_Impl;
import androidx.work.impl.model.SystemIdInfoDao_Impl;
import com.anistation.local.dao.AnimeListDao_Impl;
import com.anistation.local.dao.WatchProgressDao_Impl;
import com.anistation.local.entity.WatchProgress;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class zg implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ String y;

    public /* synthetic */ zg(String str, byte b) {
        this.x = b;
        this.y = str;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        pn6 deleteByAnimeId$lambda$0;
        pn6 removeSystemIdInfo$lambda$1;
        WatchProgress byId$lambda$0;
        boolean isHidden$lambda$0;
        pn6 unhideFromWatchHistory$lambda$0;
        pn6 deleteById$lambda$0;
        byte b = this.x;
        byte b2 = 5;
        pn6 pn6Var = pn6.a;
        String str = this.y;
        switch (b) {
            case 0:
                bi5 bi5Var = (bi5) obj;
                bi5Var.getClass();
                zh5.f(bi5Var, 0);
                zh5.c(bi5Var, str);
                return pn6Var;
            case 1:
                deleteByAnimeId$lambda$0 = AnimeListDao_Impl.deleteByAnimeId$lambda$0("DELETE FROM anime_list WHERE animeId = ?", str, (g85) obj);
                return deleteByAnimeId$lambda$0;
            case 2:
                bi5 bi5Var2 = (bi5) obj;
                zh5.e(bi5Var2, 1);
                ai5 ai5Var = yh5.d;
                w73 w73Var = zh5.a[2];
                ai5Var.getClass();
                bi5Var2.b(ai5Var, str);
                return pn6Var;
            case 3:
                zh5.c((bi5) obj, str);
                return pn6Var;
            case 4:
                return DependencyDao_Impl.d(str, (g85) obj);
            case 5:
                return Boolean.valueOf(DependencyDao_Impl.e(str, (g85) obj));
            case 6:
                return Boolean.valueOf(DependencyDao_Impl.b(str, (g85) obj));
            case 7:
                return DependencyDao_Impl.a(str, (g85) obj);
            case 8:
                cv5 cv5Var = (cv5) obj;
                cv5Var.getClass();
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                messageDigest.getClass();
                ByteBuffer byteBuffer = (ByteBuffer) tr4.a.y();
                while (!cv5Var.D()) {
                    try {
                        int remaining = byteBuffer.remaining();
                        mv5.f(cv5Var, byteBuffer);
                        if (remaining - byteBuffer.remaining() != -1) {
                            byteBuffer.flip();
                            messageDigest.update(byteBuffer);
                            byteBuffer.clear();
                        } else {
                            byte[] digest = messageDigest.digest();
                            tr4.a.i0(byteBuffer);
                            return digest;
                        }
                    } catch (Throwable th) {
                        tr4.a.i0(byteBuffer);
                        throw th;
                    }
                }
                byte[] digest2 = messageDigest.digest();
                tr4.a.i0(byteBuffer);
                return digest2;
            case 9:
                ((String) obj).getClass();
                si siVar = si.a;
                si.a(str);
                return pn6Var;
            case 10:
                String str2 = (String) obj;
                str2.getClass();
                return Boolean.valueOf(str2.equals(str));
            case 11:
                return Boolean.valueOf(a34.i((String) obj, str));
            case 12:
                return Boolean.valueOf(a34.i((String) obj, str));
            case 13:
                bi5 bi5Var3 = (bi5) obj;
                bi5Var3.getClass();
                zh5.c(bi5Var3, str);
                return pn6Var;
            case 14:
                bi5 bi5Var4 = (bi5) obj;
                zh5.c(bi5Var4, str);
                zh5.f(bi5Var4, 5);
                return pn6Var;
            case 15:
                bi5 bi5Var5 = (bi5) obj;
                w73[] w73VarArr = zh5.a;
                ai5 ai5Var2 = yh5.d;
                w73[] w73VarArr2 = zh5.a;
                w73 w73Var2 = w73VarArr2[2];
                ai5Var2.getClass();
                bi5Var5.b(ai5Var2, str);
                ai5 ai5Var3 = yh5.u;
                w73 w73Var3 = w73VarArr2[11];
                Float valueOf = Float.valueOf(0.0f);
                ai5Var3.getClass();
                bi5Var5.b(ai5Var3, valueOf);
                return pn6Var;
            case 16:
                return PreferenceDao_Impl.b(str, (g85) obj);
            case 17:
                return PreferenceDao_Impl.a(str, (g85) obj);
            case 18:
                List list = (List) obj;
                list.getClass();
                return qx1.m(str, "-", yo0.q0(list, "-", null, null, new rs4((byte) 6), 30));
            case 19:
                List list2 = (List) obj;
                list2.getClass();
                return qx1.m(str, "-", yo0.q0(list2, "-", null, null, new rs4((byte) 7), 30));
            case 20:
                zh5.c((bi5) obj, str);
                return pn6Var;
            case 21:
                if (!((Boolean) obj).booleanValue()) {
                    si siVar2 = si.a;
                    si.a(str);
                }
                return pn6Var;
            case 22:
                String str3 = (String) obj;
                si siVar3 = si.a;
                if (str3 != null) {
                    str = str3;
                }
                si.a(str);
                return pn6Var;
            case 23:
                bi5 bi5Var6 = (bi5) obj;
                zh5.e(bi5Var6, 0);
                bi5Var6.b(oh5.v, new o3(null, new jk5(b2)));
                ai5 ai5Var4 = yh5.d;
                w73 w73Var4 = zh5.a[2];
                ai5Var4.getClass();
                bi5Var6.b(ai5Var4, str);
                return pn6Var;
            case 24:
                String str4 = (String) obj;
                str4.getClass();
                if (uz5.V(str4)) {
                    if (str4.length() >= str.length()) {
                        return str4;
                    }
                    return str;
                }
                return str.concat(str4);
            case 25:
                removeSystemIdInfo$lambda$1 = SystemIdInfoDao_Impl.removeSystemIdInfo$lambda$1("DELETE FROM SystemIdInfo where work_spec_id=?", str, (g85) obj);
                return removeSystemIdInfo$lambda$1;
            case 26:
                byId$lambda$0 = WatchProgressDao_Impl.getById$lambda$0("SELECT * FROM watch_progress WHERE id = ? LIMIT 1", str, (g85) obj);
                return byId$lambda$0;
            case 27:
                isHidden$lambda$0 = WatchProgressDao_Impl.isHidden$lambda$0("SELECT EXISTS(SELECT 1 FROM removed_watch_progress WHERE animeId = ?)", str, (g85) obj);
                return Boolean.valueOf(isHidden$lambda$0);
            case 28:
                unhideFromWatchHistory$lambda$0 = WatchProgressDao_Impl.unhideFromWatchHistory$lambda$0("DELETE FROM removed_watch_progress WHERE animeId = ?", str, (g85) obj);
                return unhideFromWatchHistory$lambda$0;
            default:
                deleteById$lambda$0 = WatchProgressDao_Impl.deleteById$lambda$0("DELETE FROM watch_progress WHERE id = ?", str, (g85) obj);
                return deleteById$lambda$0;
        }
    }
}
