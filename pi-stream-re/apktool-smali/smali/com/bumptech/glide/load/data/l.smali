.class public final Lcom/bumptech/glide/load/data/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/data/e;


# instance fields
.field public final a:Lb4/o;

.field public final b:I

.field public c:Ljava/net/HttpURLConnection;

.field public d:Ljava/io/InputStream;

.field public volatile e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lw1/o;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lw1/o;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lb4/o;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bumptech/glide/load/data/l;->a:Lb4/o;

    .line 5
    .line 6
    iput p2, p0, Lcom/bumptech/glide/load/data/l;->b:I

    .line 7
    .line 8
    return-void
.end method

.method public static b(Ljava/net/HttpURLConnection;)I
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 2
    .line 3
    .line 4
    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return p0

    .line 6
    :catch_0
    move-exception p0

    .line 7
    const/4 v0, 0x3

    .line 8
    const-string v1, "HttpUrlFetcher"

    .line 9
    .line 10
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const-string v0, "Failed to get a response code"

    .line 17
    .line 18
    invoke-static {v1, v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p0, -0x1

    .line 22
    return p0
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Ljava/io/InputStream;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/data/l;->d:Ljava/io/InputStream;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :catch_0
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/data/l;->c:Ljava/net/HttpURLConnection;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 13
    .line 14
    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lcom/bumptech/glide/load/data/l;->c:Ljava/net/HttpURLConnection;

    .line 17
    .line 18
    return-void
.end method

.method public final cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/bumptech/glide/load/data/l;->e:Z

    .line 3
    .line 4
    return-void
.end method

.method public final d()Lv3/a;
    .locals 1

    .line 1
    sget-object v0, Lv3/a;->b:Lv3/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(Lcom/bumptech/glide/g;Lcom/bumptech/glide/load/data/d;)V
    .locals 8

    .line 1
    iget-object p1, p0, Lcom/bumptech/glide/load/data/l;->a:Lb4/o;

    .line 2
    .line 3
    const-string v0, "Finished http url fetcher fetch in "

    .line 4
    .line 5
    const-string v1, "HttpUrlFetcher"

    .line 6
    .line 7
    sget v2, Lp4/g;->b:I

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    const/4 v4, 0x2

    .line 14
    :try_start_0
    invoke-virtual {p1}, Lb4/o;->d()Ljava/net/URL;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    iget-object p1, p1, Lb4/o;->b:Lb4/p;

    .line 19
    .line 20
    invoke-interface {p1}, Lb4/p;->a()Ljava/util/Map;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v7, 0x0

    .line 26
    invoke-virtual {p0, v5, v6, v7, p1}, Lcom/bumptech/glide/load/data/l;->f(Ljava/net/URL;ILjava/net/URL;Ljava/util/Map;)Ljava/io/InputStream;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p2, p1}, Lcom/bumptech/glide/load/data/d;->s(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    new-instance p1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catch_0
    move-exception p1

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_2

    .line 49
    :goto_0
    const/4 v5, 0x3

    .line 50
    :try_start_1
    invoke-static {v1, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_0

    .line 55
    .line 56
    const-string v5, "Failed to load data for url"

    .line 57
    .line 58
    invoke-static {v1, v5, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 59
    .line 60
    .line 61
    :cond_0
    invoke-interface {p2, p1}, Lcom/bumptech/glide/load/data/d;->n(Ljava/lang/Exception;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    .line 63
    .line 64
    invoke-static {v1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    new-instance p1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :goto_1
    invoke-static {v2, v3}, Lp4/g;->a(J)D

    .line 76
    .line 77
    .line 78
    move-result-wide v2

    .line 79
    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-static {v1, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    :cond_1
    return-void

    .line 90
    :goto_2
    invoke-static {v1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    if-eqz p2, :cond_2

    .line 95
    .line 96
    new-instance p2, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v2, v3}, Lp4/g;->a(J)D

    .line 102
    .line 103
    .line 104
    move-result-wide v2

    .line 105
    invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-static {v1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    :cond_2
    throw p1
.end method

.method public final f(Ljava/net/URL;ILjava/net/URL;Ljava/util/Map;)Ljava/io/InputStream;
    .locals 7

    .line 1
    const/4 v0, 0x5

    .line 2
    const/4 v1, -0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-ge p2, v0, :cond_c

    .line 5
    .line 6
    if-eqz p3, :cond_1

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p1}, Ljava/net/URL;->toURI()Ljava/net/URI;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p3}, Ljava/net/URL;->toURI()Ljava/net/URI;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    invoke-virtual {v0, p3}, Ljava/net/URI;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    if-nez p3, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p3, Lm1/b;

    .line 24
    .line 25
    const-string v0, "In re-direct loop"

    .line 26
    .line 27
    invoke-direct {p3, v1, v0, v2}, Lm1/b;-><init>(ILjava/lang/String;Ljava/io/IOException;)V

    .line 28
    .line 29
    .line 30
    throw p3
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    :catch_0
    :cond_1
    :goto_0
    const/4 p3, 0x0

    .line 32
    :try_start_1
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5

    .line 37
    .line 38
    invoke-interface {p4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Ljava/util/Map$Entry;

    .line 57
    .line 58
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    check-cast v5, Ljava/lang/String;

    .line 63
    .line 64
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    check-cast v4, Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v0, v5, v4}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    iget v3, p0, Lcom/bumptech/glide/load/data/l;->b:I

    .line 75
    .line 76
    invoke-virtual {v0, v3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, p3}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 83
    .line 84
    .line 85
    const/4 v3, 0x1

    .line 86
    invoke-virtual {v0, v3}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, p3}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 90
    .line 91
    .line 92
    iput-object v0, p0, Lcom/bumptech/glide/load/data/l;->c:Ljava/net/HttpURLConnection;

    .line 93
    .line 94
    :try_start_2
    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lcom/bumptech/glide/load/data/l;->c:Ljava/net/HttpURLConnection;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iput-object v0, p0, Lcom/bumptech/glide/load/data/l;->d:Ljava/io/InputStream;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4

    .line 104
    .line 105
    iget-boolean v0, p0, Lcom/bumptech/glide/load/data/l;->e:Z

    .line 106
    .line 107
    if-eqz v0, :cond_3

    .line 108
    .line 109
    return-object v2

    .line 110
    :cond_3
    iget-object v0, p0, Lcom/bumptech/glide/load/data/l;->c:Ljava/net/HttpURLConnection;

    .line 111
    .line 112
    invoke-static {v0}, Lcom/bumptech/glide/load/data/l;->b(Ljava/net/HttpURLConnection;)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    div-int/lit8 v4, v0, 0x64

    .line 117
    .line 118
    const/4 v5, 0x2

    .line 119
    if-ne v4, v5, :cond_4

    .line 120
    .line 121
    move v5, v3

    .line 122
    goto :goto_2

    .line 123
    :cond_4
    move v5, p3

    .line 124
    :goto_2
    const/4 v6, 0x3

    .line 125
    if-eqz v5, :cond_7

    .line 126
    .line 127
    iget-object p1, p0, Lcom/bumptech/glide/load/data/l;->c:Ljava/net/HttpURLConnection;

    .line 128
    .line 129
    const-string p2, "HttpUrlFetcher"

    .line 130
    .line 131
    const-string p3, "Got non empty content encoding: "

    .line 132
    .line 133
    :try_start_3
    invoke-virtual {p1}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p4

    .line 137
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 138
    .line 139
    .line 140
    move-result p4

    .line 141
    if-eqz p4, :cond_5

    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/net/URLConnection;->getContentLength()I

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 148
    .line 149
    .line 150
    move-result-object p3

    .line 151
    int-to-long v0, p2

    .line 152
    new-instance p2, Lp4/d;

    .line 153
    .line 154
    invoke-direct {p2, p3, v0, v1}, Lp4/d;-><init>(Ljava/io/InputStream;J)V

    .line 155
    .line 156
    .line 157
    iput-object p2, p0, Lcom/bumptech/glide/load/data/l;->d:Ljava/io/InputStream;

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_5
    invoke-static {p2, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 161
    .line 162
    .line 163
    move-result p4

    .line 164
    if-eqz p4, :cond_6

    .line 165
    .line 166
    new-instance p4, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {p4, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p3

    .line 175
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p3

    .line 182
    invoke-static {p2, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 183
    .line 184
    .line 185
    :cond_6
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    iput-object p2, p0, Lcom/bumptech/glide/load/data/l;->d:Ljava/io/InputStream;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 190
    .line 191
    :goto_3
    iget-object p1, p0, Lcom/bumptech/glide/load/data/l;->d:Ljava/io/InputStream;

    .line 192
    .line 193
    return-object p1

    .line 194
    :catch_1
    move-exception p2

    .line 195
    new-instance p3, Lm1/b;

    .line 196
    .line 197
    const-string p4, "Failed to obtain InputStream"

    .line 198
    .line 199
    invoke-static {p1}, Lcom/bumptech/glide/load/data/l;->b(Ljava/net/HttpURLConnection;)I

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    invoke-direct {p3, p1, p4, p2}, Lm1/b;-><init>(ILjava/lang/String;Ljava/io/IOException;)V

    .line 204
    .line 205
    .line 206
    throw p3

    .line 207
    :cond_7
    if-ne v4, v6, :cond_8

    .line 208
    .line 209
    move p3, v3

    .line 210
    :cond_8
    if-eqz p3, :cond_a

    .line 211
    .line 212
    iget-object p3, p0, Lcom/bumptech/glide/load/data/l;->c:Ljava/net/HttpURLConnection;

    .line 213
    .line 214
    const-string v1, "Location"

    .line 215
    .line 216
    invoke-virtual {p3, v1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p3

    .line 220
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    if-nez v1, :cond_9

    .line 225
    .line 226
    :try_start_4
    new-instance v1, Ljava/net/URL;

    .line 227
    .line 228
    invoke-direct {v1, p1, p3}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/net/MalformedURLException; {:try_start_4 .. :try_end_4} :catch_2

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0}, Lcom/bumptech/glide/load/data/l;->c()V

    .line 232
    .line 233
    .line 234
    add-int/2addr p2, v3

    .line 235
    invoke-virtual {p0, v1, p2, p1, p4}, Lcom/bumptech/glide/load/data/l;->f(Ljava/net/URL;ILjava/net/URL;Ljava/util/Map;)Ljava/io/InputStream;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    return-object p1

    .line 240
    :catch_2
    move-exception p1

    .line 241
    new-instance p2, Lm1/b;

    .line 242
    .line 243
    const-string p4, "Bad redirect url: "

    .line 244
    .line 245
    invoke-static {p4, p3}, Lr/f;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p3

    .line 249
    invoke-direct {p2, v0, p3, p1}, Lm1/b;-><init>(ILjava/lang/String;Ljava/io/IOException;)V

    .line 250
    .line 251
    .line 252
    throw p2

    .line 253
    :cond_9
    new-instance p1, Lm1/b;

    .line 254
    .line 255
    const-string p2, "Received empty or null redirect url"

    .line 256
    .line 257
    invoke-direct {p1, v0, p2, v2}, Lm1/b;-><init>(ILjava/lang/String;Ljava/io/IOException;)V

    .line 258
    .line 259
    .line 260
    throw p1

    .line 261
    :cond_a
    if-ne v0, v1, :cond_b

    .line 262
    .line 263
    new-instance p1, Lm1/b;

    .line 264
    .line 265
    invoke-direct {p1, v0, v3}, Lm1/b;-><init>(II)V

    .line 266
    .line 267
    .line 268
    throw p1

    .line 269
    :cond_b
    :try_start_5
    new-instance p1, Lm1/b;

    .line 270
    .line 271
    iget-object p2, p0, Lcom/bumptech/glide/load/data/l;->c:Ljava/net/HttpURLConnection;

    .line 272
    .line 273
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object p2

    .line 277
    invoke-direct {p1, v0, p2, v2}, Lm1/b;-><init>(ILjava/lang/String;Ljava/io/IOException;)V

    .line 278
    .line 279
    .line 280
    throw p1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 281
    :catch_3
    move-exception p1

    .line 282
    new-instance p2, Lm1/b;

    .line 283
    .line 284
    const-string p3, "Failed to get a response message"

    .line 285
    .line 286
    invoke-direct {p2, v0, p3, p1}, Lm1/b;-><init>(ILjava/lang/String;Ljava/io/IOException;)V

    .line 287
    .line 288
    .line 289
    throw p2

    .line 290
    :catch_4
    move-exception p1

    .line 291
    new-instance p2, Lm1/b;

    .line 292
    .line 293
    iget-object p3, p0, Lcom/bumptech/glide/load/data/l;->c:Ljava/net/HttpURLConnection;

    .line 294
    .line 295
    invoke-static {p3}, Lcom/bumptech/glide/load/data/l;->b(Ljava/net/HttpURLConnection;)I

    .line 296
    .line 297
    .line 298
    move-result p3

    .line 299
    const-string p4, "Failed to connect or obtain data"

    .line 300
    .line 301
    invoke-direct {p2, p3, p4, p1}, Lm1/b;-><init>(ILjava/lang/String;Ljava/io/IOException;)V

    .line 302
    .line 303
    .line 304
    throw p2

    .line 305
    :catch_5
    move-exception p1

    .line 306
    new-instance p2, Lm1/b;

    .line 307
    .line 308
    const-string p4, "URL.openConnection threw"

    .line 309
    .line 310
    invoke-direct {p2, p3, p4, p1}, Lm1/b;-><init>(ILjava/lang/String;Ljava/io/IOException;)V

    .line 311
    .line 312
    .line 313
    throw p2

    .line 314
    :cond_c
    new-instance p1, Lm1/b;

    .line 315
    .line 316
    const-string p2, "Too many (> 5) redirects!"

    .line 317
    .line 318
    invoke-direct {p1, v1, p2, v2}, Lm1/b;-><init>(ILjava/lang/String;Ljava/io/IOException;)V

    .line 319
    .line 320
    .line 321
    throw p1
.end method
