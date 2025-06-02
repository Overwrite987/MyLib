package com.github.groundbreakingmc.mylib.actions;

import com.github.groundbreakingmc.mylib.actions.context.ActionContext;
import org.jetbrains.annotations.NotNull;

/**
 * Represents an executable action that performs a task using the provided context.
 *
 * @param <C> the type of context required for execution
 */
public interface Action<C extends ActionContext> {

    /**
     * Executes the action using the specified context.
     *
     * @param context the context required for this action
     */
    void execute(@NotNull C context);
}
