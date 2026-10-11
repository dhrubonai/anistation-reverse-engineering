.class public abstract Lcom/bumptech/glide/load/data/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/data/e;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public final c:Ljava/lang/Comparable;

.field public final d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Comparable;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/bumptech/glide/load/data/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/bumptech/glide/load/data/b;->d:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lcom/bumptech/glide/load/data/b;->c:Ljava/lang/Comparable;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public abstract b(Ljava/lang/Object;)V
.end method

.method public final c()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/bumptech/glide/load/data/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_1

    .line 7
    :pswitch_0
    iget-object v0, p0, Lcom/bumptech/glide/load/data/b;->b:Ljava/lang/Object;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/bumptech/glide/load/data/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    :catch_0
    :goto_0
    return-void

    .line 16
    :goto_1
    iget-object v0, p0, Lcom/bumptech/glide/load/data/b;->b:Ljava/lang/Object;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    :try_start_1
    invoke-virtual {p0, v0}, Lcom/bumptech/glide/load/data/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 21
    .line 22
    .line 23
    :catch_1
    :cond_1
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final cancel()V
    .locals 0

    .line 1
    return-void
.end method

.method public final d()Lv3/a;
    .locals 1

    .line 1
    sget-object v0, Lv3/a;->a:Lv3/a;

    return-object v0
.end method

.method public final e(Lcom/bumptech/glide/g;Lcom/bumptech/glide/load/data/d;)V
    .locals 3

    .line 1
    iget p1, p0, Lcom/bumptech/glide/load/data/b;->a:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/bumptech/glide/load/data/b;->c:Ljava/lang/Comparable;

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    iget-object v2, p0, Lcom/bumptech/glide/load/data/b;->d:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    goto :goto_1

    .line 12
    :pswitch_0
    :try_start_0
    check-cast v2, Landroid/content/res/AssetManager;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0, v2, v0}, Lcom/bumptech/glide/load/data/b;->f(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/Closeable;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lcom/bumptech/glide/load/data/b;->b:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-interface {p2, p1}, Lcom/bumptech/glide/load/data/d;->s(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catch_0
    move-exception p1

    .line 27
    const-string v0, "AssetPathFetcher"

    .line 28
    .line 29
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    const-string v1, "Failed to load data from asset manager"

    .line 36
    .line 37
    invoke-static {v0, v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-interface {p2, p1}, Lcom/bumptech/glide/load/data/d;->n(Ljava/lang/Exception;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    return-void

    .line 44
    :goto_1
    :try_start_1
    check-cast v0, Landroid/net/Uri;

    .line 45
    .line 46
    check-cast v2, Landroid/content/ContentResolver;

    .line 47
    .line 48
    invoke-virtual {p0, v2, v0}, Lcom/bumptech/glide/load/data/b;->g(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lcom/bumptech/glide/load/data/b;->b:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-interface {p2, p1}, Lcom/bumptech/glide/load/data/d;->s(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :catch_1
    move-exception p1

    .line 59
    const-string v0, "LocalUriFetcher"

    .line 60
    .line 61
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    const-string v1, "Failed to open Uri"

    .line 68
    .line 69
    invoke-static {v0, v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 70
    .line 71
    .line 72
    :cond_1
    invoke-interface {p2, p1}, Lcom/bumptech/glide/load/data/d;->n(Ljava/lang/Exception;)V

    .line 73
    .line 74
    .line 75
    :goto_2
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public abstract f(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/Closeable;
.end method

.method public abstract g(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/Object;
.end method
