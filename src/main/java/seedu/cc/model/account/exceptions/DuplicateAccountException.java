package seedu.cc.model.account.exceptions;

/**
 * Signals that the operation will result in duplicate Accounts (Accounts are considered duplicates if they have
 * the same identity).
 */
public class DuplicateAccountException extends RuntimeException {
    public DuplicateAccountException() {
        super("Operation would result in duplicate accounts");
    }
}
