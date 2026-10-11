.class public final Landroidx/concurrent/futures/h;
.super Landroidx/concurrent/futures/a;
.source "SourceFile"


# virtual methods
.method public final a(Landroidx/concurrent/futures/j;Landroidx/concurrent/futures/e;Landroidx/concurrent/futures/e;)Z
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p1, Landroidx/concurrent/futures/j;->listeners:Landroidx/concurrent/futures/e;

    .line 3
    .line 4
    if-ne v0, p2, :cond_0

    .line 5
    .line 6
    iput-object p3, p1, Landroidx/concurrent/futures/j;->listeners:Landroidx/concurrent/futures/e;

    .line 7
    .line 8
    monitor-exit p1

    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    monitor-exit p1

    .line 12
    const/4 p1, 0x0

    .line 13
    return p1

    .line 14
    :catchall_0
    move-exception p2

    .line 15
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p2
.end method

.method public final b(Landroidx/concurrent/futures/j;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p1, Landroidx/concurrent/futures/j;->value:Ljava/lang/Object;

    .line 3
    .line 4
    if-ne v0, p2, :cond_0

    .line 5
    .line 6
    iput-object p3, p1, Landroidx/concurrent/futures/j;->value:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-exit p1

    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    monitor-exit p1

    .line 12
    const/4 p1, 0x0

    .line 13
    return p1

    .line 14
    :catchall_0
    move-exception p2

    .line 15
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p2
.end method

.method public final c(Landroidx/concurrent/futures/j;Landroidx/concurrent/futures/i;Landroidx/concurrent/futures/i;)Z
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p1, Landroidx/concurrent/futures/j;->waiters:Landroidx/concurrent/futures/i;

    .line 3
    .line 4
    if-ne v0, p2, :cond_0

    .line 5
    .line 6
    iput-object p3, p1, Landroidx/concurrent/futures/j;->waiters:Landroidx/concurrent/futures/i;

    .line 7
    .line 8
    monitor-exit p1

    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    monitor-exit p1

    .line 12
    const/4 p1, 0x0

    .line 13
    return p1

    .line 14
    :catchall_0
    move-exception p2

    .line 15
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p2
.end method

.method public final d(Landroidx/concurrent/futures/i;Landroidx/concurrent/futures/i;)V
    .locals 0

    .line 1
    iput-object p2, p1, Landroidx/concurrent/futures/i;->b:Landroidx/concurrent/futures/i;

    .line 2
    .line 3
    return-void
.end method

.method public final e(Landroidx/concurrent/futures/i;Ljava/lang/Thread;)V
    .locals 0

    .line 1
    iput-object p2, p1, Landroidx/concurrent/futures/i;->a:Ljava/lang/Thread;

    .line 2
    .line 3
    return-void
.end method
