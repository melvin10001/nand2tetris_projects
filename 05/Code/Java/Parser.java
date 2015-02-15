/*
 * Encapsulates access to the input code.
 *      Reads an assembly language command, prases it and 
 *      provides convenient access to to the command's components. 
 *      Also removes white space and comments.
 */
class Parser{
    public static enum CommandType { A_COMMAND, C_COMMAND, L_COMMAND };
    
    /*
     *Opens the input file/stream and gets ready to parse it
     */
    public Parser(String filename)
    {
    }

    /*
     * Are there more commands in the input?
     */        
    public boolean hasMoreCommands()
    {
        return false;
    }

    /*
     *Moves to the next command. 
     *     Should only be called if hasMoreCommands() is true
     *     Initially there is no current command
     */
    public void advance()
    {
    }

    /*
     * Returns the current command
     */        
    public String getCurrentCommand()
    {
        return "";
    }
    
    /*
     * Resets back to original state
     */        
    public void reset()
    {
    }

    /*
     * Returns the type of the current command.
     *      A_COMMAND for @Xxx where Xxx is a symbol or number
     *      C_COMMAND for dest=comp;jump
     *      L_COMMAND for (xxx) where Xxx is symbol
     */
    public CommandType commandType()
    {
        return null;
    }

    /*
     *Returns the symbol Xxx of the current command
     *      of type @Xxx or (Xxx). Should only be called when commandType
     *      is A_COMMAND or L_COMMAND
     */
    public String symbol()
    {
        return "";
    }    

    /*
     *Returns the destination mnemonic in the current C-command. Should be
     *      called only when commandType() is C_COMMAND
     */
    public String dest()
    {
        return "";
    }    

    /*
     *Returns the comp mnemonic in the current C-command. Should be
           called only when commandType() is C_COMMAND
     */
    public String comp()
    {
        return "";
    }    

    /*
     *Returns the jump mnemonic in the current C-command. Should be
           called only when commandType() is C_COMMAND
     */            
    public String jump()
    {
        return "";
    }    
}
