package z7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import msr.pistream.app.download.PiStreamDownloadService;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {
    public int A;

    /* renamed from: a, reason: collision with root package name */
    public String f12082a;

    /* renamed from: b, reason: collision with root package name */
    public String f12083b;

    /* renamed from: c, reason: collision with root package name */
    public String f12084c;

    /* renamed from: d, reason: collision with root package name */
    public String f12085d;

    /* renamed from: e, reason: collision with root package name */
    public String f12086e;

    /* renamed from: f, reason: collision with root package name */
    public int f12087f;

    /* renamed from: g, reason: collision with root package name */
    public int f12088g;

    /* renamed from: h, reason: collision with root package name */
    public String f12089h;

    /* renamed from: i, reason: collision with root package name */
    public String f12090i;

    /* renamed from: j, reason: collision with root package name */
    public String f12091j;

    /* renamed from: k, reason: collision with root package name */
    public String f12092k;

    /* renamed from: l, reason: collision with root package name */
    public String f12093l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12094m;

    /* renamed from: n, reason: collision with root package name */
    public String f12095n;
    public String o;

    /* renamed from: r, reason: collision with root package name */
    public int f12098r;

    /* renamed from: s, reason: collision with root package name */
    public long f12099s;

    /* renamed from: t, reason: collision with root package name */
    public long f12100t;

    /* renamed from: v, reason: collision with root package name */
    public String f12102v;

    /* renamed from: w, reason: collision with root package name */
    public long f12103w;

    /* renamed from: x, reason: collision with root package name */
    public int f12104x;

    /* renamed from: z, reason: collision with root package name */
    public int f12106z;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f12096p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public List f12097q = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public int f12101u = 1;

    /* renamed from: y, reason: collision with root package name */
    public String f12105y = "";

    public static b a(JSONObject jSONObject) {
        b bVar = new b();
        bVar.f12082a = jSONObject.optString(PiStreamDownloadService.EXTRA_ID, "");
        bVar.f12083b = jSONObject.optString("animeTitle", "");
        bVar.f12084c = jSONObject.optString("episodeName", "");
        bVar.f12085d = jSONObject.optString("episodeUrl", "");
        bVar.f12086e = jSONObject.optString("playbackId", "");
        bVar.f12087f = jSONObject.optInt("se", 0);
        bVar.f12088g = jSONObject.optInt("ep", 0);
        bVar.f12089h = jSONObject.optString("quality", "AUTO");
        bVar.f12090i = jSONObject.optString("audioTag", "");
        bVar.f12091j = jSONObject.optString("videoUrl", "");
        bVar.f12092k = jSONObject.optString("referer", "");
        bVar.f12093l = jSONObject.optString("cookies", "");
        bVar.f12094m = jSONObject.optBoolean("isDash", false);
        bVar.f12095n = jSONObject.optString("fileName", "");
        bVar.o = jSONObject.optString("fileUri", "");
        JSONArray optJSONArray = jSONObject.optJSONArray("subUrls");
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                bVar.f12096p.add(optJSONArray.optString(i10, ""));
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("subUris");
        if (optJSONArray2 != null) {
            for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                bVar.f12097q.add(optJSONArray2.optString(i11, ""));
            }
        }
        bVar.f12098r = jSONObject.optInt("progress", 0);
        bVar.f12099s = jSONObject.optLong("downloadedBytes", 0L);
        bVar.f12100t = jSONObject.optLong("totalBytes", 0L);
        try {
            bVar.f12101u = r.f.q(jSONObject.optString("state", "QUEUED"));
        } catch (Exception unused) {
            bVar.f12101u = 1;
        }
        bVar.f12102v = jSONObject.optString("error", "");
        bVar.f12103w = jSONObject.optLong("createdAt", 0L);
        bVar.f12104x = jSONObject.optInt("hlsNextSegment", 0);
        bVar.f12105y = jSONObject.optString("phase", "");
        bVar.f12106z = jSONObject.optInt("subDone", 0);
        bVar.A = jSONObject.optInt("subTotal", 0);
        return bVar;
    }

    public final JSONObject b() {
        String l10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(PiStreamDownloadService.EXTRA_ID, this.f12082a);
            jSONObject.put("animeTitle", this.f12083b);
            jSONObject.put("episodeName", this.f12084c);
            jSONObject.put("episodeUrl", this.f12085d);
            jSONObject.put("playbackId", this.f12086e);
            jSONObject.put("se", this.f12087f);
            jSONObject.put("ep", this.f12088g);
            jSONObject.put("quality", this.f12089h);
            jSONObject.put("audioTag", this.f12090i);
            jSONObject.put("videoUrl", this.f12091j);
            jSONObject.put("referer", this.f12092k);
            jSONObject.put("cookies", this.f12093l);
            jSONObject.put("isDash", this.f12094m);
            jSONObject.put("fileName", this.f12095n);
            jSONObject.put("fileUri", this.o);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.f12096p;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
            }
            jSONObject.put("subUrls", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            List list = this.f12097q;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put((String) it2.next());
                }
            }
            jSONObject.put("subUris", jSONArray2);
            jSONObject.put("progress", this.f12098r);
            jSONObject.put("downloadedBytes", this.f12099s);
            jSONObject.put("totalBytes", this.f12100t);
            int i10 = this.f12101u;
            if (i10 == 0) {
                l10 = "QUEUED";
            } else {
                l10 = r.f.l(i10);
            }
            jSONObject.put("state", l10);
            jSONObject.put("error", this.f12102v);
            jSONObject.put("createdAt", this.f12103w);
            jSONObject.put("hlsNextSegment", this.f12104x);
            jSONObject.put("phase", this.f12105y);
            jSONObject.put("subDone", this.f12106z);
            jSONObject.put("subTotal", this.A);
            return jSONObject;
        } catch (Exception unused) {
            return new JSONObject();
        }
    }
}
