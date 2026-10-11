package l8;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import msr.pistream.app.download.PiStreamDownloadService;
import msr.pistream.app.ui.player.PlayerActivity;

/* loaded from: classes.dex */
public final class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z7.b f6899b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f6900c;

    public /* synthetic */ c(d dVar, z7.b bVar, int i10) {
        this.f6898a = i10;
        this.f6900c = dVar;
        this.f6899b = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f6898a;
        z7.b bVar = this.f6899b;
        d dVar = this.f6900c;
        switch (i10) {
            case 0:
                int i11 = d.f6901t0;
                PiStreamDownloadService.action(dVar.f4484m0, PiStreamDownloadService.ACTION_PAUSE, bVar.f12082a);
                return;
            case 1:
                int i12 = d.f6901t0;
                PiStreamDownloadService.action(dVar.f4484m0, PiStreamDownloadService.ACTION_RESUME, bVar.f12082a);
                return;
            case 2:
                int i13 = d.f6901t0;
                dVar.getClass();
                try {
                    String str = bVar.o;
                    if (str != null && !str.isEmpty()) {
                        a8.e eVar = new a8.e(bVar.f12084c, bVar.f12085d, "", bVar.f12088g);
                        eVar.f187e = bVar.f12083b;
                        eVar.f188f = bVar.f12086e;
                        Intent putExtra = new Intent(dVar.f4484m0, (Class<?>) PlayerActivity.class).putExtra("episode", eVar).putExtra("offline_uri", bVar.o);
                        List list = bVar.f12097q;
                        if (list != null && !list.isEmpty()) {
                            putExtra.putStringArrayListExtra("offline_subs", new ArrayList<>(bVar.f12097q));
                        }
                        dVar.f4484m0.startActivity(putExtra);
                        return;
                    }
                    Toast.makeText(dVar.f4484m0, "File missing", 0).show();
                    return;
                } catch (Exception unused) {
                    Toast.makeText(dVar.f4484m0, "Cannot play file", 0).show();
                    return;
                }
            case 3:
                z7.f o = z7.f.o();
                int i14 = d.f6901t0;
                Context context = dVar.f4484m0;
                String str2 = bVar.f12082a;
                o.getClass();
                Context applicationContext = context.getApplicationContext();
                if (z7.d.b(applicationContext, str2) != null) {
                    ConcurrentHashMap concurrentHashMap = o.f12127e;
                    concurrentHashMap.put(str2, Boolean.TRUE);
                    Future future = (Future) o.f12126d.get(str2);
                    if (future != null) {
                        future.cancel(true);
                    }
                    Boolean bool = Boolean.FALSE;
                    concurrentHashMap.put(str2, bool);
                    o.f12128f.put(str2, bool);
                    z7.f.g(applicationContext, z7.d.b(applicationContext, str2), str2);
                    z7.b b10 = z7.d.b(applicationContext, str2);
                    if (b10 != null) {
                        b10.f12101u = 1;
                        b10.f12098r = 0;
                        b10.f12099s = 0L;
                        b10.f12100t = 0L;
                        b10.f12105y = "";
                        b10.f12106z = 0;
                        b10.A = 0;
                        b10.f12097q = new ArrayList();
                        b10.o = "";
                        b10.f12102v = "";
                        b10.f12104x = 0;
                        z7.d.c(applicationContext, b10);
                        o.l();
                        PiStreamDownloadService.startAction(applicationContext, PiStreamDownloadService.ACTION_KICK);
                        o.x(applicationContext);
                    }
                }
                Toast.makeText(dVar.f4484m0, "Re-downloading", 0).show();
                return;
            case 4:
                z7.f o6 = z7.f.o();
                int i15 = d.f6901t0;
                o6.d(dVar.f4484m0, bVar.f12082a);
                return;
            default:
                z7.f o9 = z7.f.o();
                int i16 = d.f6901t0;
                o9.f(dVar.f4484m0, bVar.f12082a);
                return;
        }
    }
}
